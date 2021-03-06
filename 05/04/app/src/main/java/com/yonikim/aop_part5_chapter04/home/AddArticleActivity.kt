package com.yonikim.aop_part5_chapter04.home


import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.ktx.storage
import com.yonikim.aop_part5_chapter04.DBKey.Companion.DB_ARTICLES
import com.yonikim.aop_part5_chapter04.R
import com.yonikim.aop_part5_chapter04.adapter.PhotoListAdapter
import com.yonikim.aop_part5_chapter04.databinding.ActivityAddArticleBinding
import com.yonikim.aop_part5_chapter04.gallery.GalleryActivity
import com.yonikim.aop_part5_chapter04.photo.CameraActivity
import kotlinx.coroutines.*
import kotlinx.coroutines.tasks.await
import java.lang.Exception

class AddArticleActivity : AppCompatActivity() {

    companion object {
        const val PERMISSION_REQUEST_CODE = 1000
        const val GALLERY_REQUEST_CODE = 1001
        const val CAMERA_REQUEST_CODE = 1002

        private const val URI_LIST_KEY = "uriList"
    }

    private var imageUriList: ArrayList<Uri> = arrayListOf()
    private val auth: FirebaseAuth by lazy {
        Firebase.auth
    }
    private val storage: FirebaseStorage by lazy {
        Firebase.storage
    }
    private val articleDB: DatabaseReference by lazy {
        Firebase.database.reference.child(DB_ARTICLES)
    }

    private val photoListAdapter = PhotoListAdapter { uri -> removePhoto(uri) }

    private lateinit var binding: ActivityAddArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() = with(binding) {
        photoRecyclerView.adapter = photoListAdapter
        imageAddButton.setOnClickListener {
            showPictureUploadDialog()
        }
        submitButton.setOnClickListener {
            val title = findViewById<EditText>(R.id.titleEditText).text.toString()
            val content = findViewById<EditText>(R.id.contentEditText).text.toString()
            val userId = auth.currentUser?.uid.orEmpty()

            shoProgress()

            if (imageUriList.isNotEmpty()) {
                lifecycleScope.launch {
                    val result = uploadPhoto(imageUriList)
                    afterUploadPhoto(result, title, content, userId)
                }
            } else {
                uploadArticle(userId, title, content, listOf())

            }
        }
    }

    private fun afterUploadPhoto(
        result: List<Any>,
        title: String,
        content: String,
        userId: String
    ) {
        val errorResult = result.filterIsInstance<Pair<Uri, Exception>>()
        val successResult = result.filterIsInstance<String>()

        uploadArticle(userId, title, content, result.filterIsInstance<String>())

        when {
            errorResult.isNotEmpty() && successResult.isNotEmpty() -> {
                photoUploadErrorButContinueDialog(
                    errorResult,
                    successResult,
                    title,
                    content,
                    userId
                )

            }
            errorResult.isNotEmpty() && successResult.isEmpty() -> {
                photoUploadError()
            }
            else -> {

            }
        }
    }

    private suspend fun uploadPhoto(uriList: List<Uri>) = withContext(Dispatchers.IO) {
        val uploadDeferred: List<Deferred<Any>> = uriList.mapIndexed { index, uri ->
            lifecycleScope.async {
                try {
                    val fileName = "image_${index}.png"
                    return@async storage
                        .reference
                        .child("article/photo")
                        .child(fileName)
                        .putFile(uri)
                        .await()
                        .storage
                        .downloadUrl
                        .await()
                        .toString()
                } catch (e: Exception) {
                    e.printStackTrace()
                    return@async Pair(uri, e)
                }
            }
        }
        return@withContext uploadDeferred.awaitAll()
    }

    private fun uploadArticle(
        userId: String,
        title: String,
        content: String,
        imageUrlList: List<String>
    ) {
        val articleModel =
            ArticleModel(userId, title, System.currentTimeMillis(), content, imageUrlList)
        articleDB.push().setValue(articleModel)

        finish()
        hideProgress()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            PERMISSION_REQUEST_CODE -> if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startGalleryScreen()
            } else {
                Toast.makeText(this, "????????? ?????????????????????.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun startCameraScreen() {
        val intent = Intent(this, CameraActivity::class.java)
        startActivityForResult(
            intent,
            CAMERA_REQUEST_CODE
        )
    }

    private fun startGalleryScreen() {
//        val intent = Intent(Intent.ACTION_GET_CONTENT)
//        intent.type = "image/*"
//        startActivityForResult(intent, GALLERY_REQUEST_CODE)

        startActivityForResult(
            GalleryActivity.newIntent(this),
            GALLERY_REQUEST_CODE
        )
    }

    private fun shoProgress() {
        binding.progressBar.isVisible = true
    }

    private fun hideProgress() {
        binding.progressBar.isVisible = false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode != Activity.RESULT_OK) {
            return
        }

        when (requestCode) {
            GALLERY_REQUEST_CODE -> {
                data?.let { intent ->
                    val uriList = intent.getParcelableArrayListExtra<Uri>(URI_LIST_KEY)
                    uriList?.let { list ->
                        imageUriList.addAll(list)
                        photoListAdapter.setPhotoList(imageUriList)
                    }
                } ?: kotlin.run {
                    Toast.makeText(this, "????????? ???????????? ???????????????.", Toast.LENGTH_SHORT).show()
                }
            }
            CAMERA_REQUEST_CODE -> {
                data?.let { intent ->
                    val uriList = intent.getParcelableArrayListExtra<Uri>(URI_LIST_KEY)
                    uriList?.let { list ->
                        imageUriList.addAll(list)
                        photoListAdapter.setPhotoList(imageUriList)
                    }
                } ?: kotlin.run {
                    Toast.makeText(this, "????????? ???????????? ???????????????.", Toast.LENGTH_SHORT).show()
                }
            }
            else -> {
                Toast.makeText(this, "????????? ???????????? ???????????????.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun showPermissionContextPopup() {
        AlertDialog.Builder(this)
            .setTitle("????????? ???????????????.")
            .setMessage("????????? ???????????? ?????? ????????? ???????????????.")
            .setPositiveButton("??????", { _, _ ->
                requestPermissions(
                    arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
                    PERMISSION_REQUEST_CODE
                )
            })
            .create()
            .show()
    }

    private fun checkExternalStoragePermission(uploadAction: () -> Unit) {
        when {
            ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.READ_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED -> {
                uploadAction()
            }
            shouldShowRequestPermissionRationale(android.Manifest.permission.READ_EXTERNAL_STORAGE) -> {
                showPermissionContextPopup()
            }
            else -> {
                requestPermissions(
                    arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
                    PERMISSION_REQUEST_CODE
                )
            }
        }
    }

    private fun showPictureUploadDialog() {
        AlertDialog.Builder(this)
            .setTitle("????????????")
            .setMessage("??????????????? ????????? ???????????????.")
            .setPositiveButton("?????????", { _, _ ->
                checkExternalStoragePermission {
                    startCameraScreen()
                }
            })
            .setNegativeButton("?????????", { _, _ ->
                checkExternalStoragePermission {
                    startGalleryScreen()
                }
            })
            .create()
            .show()
    }

    private fun photoUploadErrorButContinueDialog(
        errorResult: List<Pair<Uri, Exception>>,
        successResult: List<String>,
        title: String,
        content: String,
        userId: String
    ) {
        AlertDialog.Builder(this)
            .setTitle("?????? ????????? ????????? ??????")
            .setMessage("???????????? ????????? ???????????? ????????????." + errorResult.map { (uri, _) -> "${uri}\n" } + "???????????? ???????????? ????????? ???????????????????")
            .setPositiveButton("?????????") { _, _ ->
                uploadArticle(userId, title, content, successResult)
            }
            .create()
            .show()
    }


    private fun photoUploadError() {
        Toast.makeText(this, "?????? ???????????? ??????????????????.", Toast.LENGTH_SHORT).show()
        hideProgress()
    }

    private fun removePhoto(uri: Uri) {
        imageUriList.remove(uri)
        photoListAdapter.setPhotoList(imageUriList)
    }


}