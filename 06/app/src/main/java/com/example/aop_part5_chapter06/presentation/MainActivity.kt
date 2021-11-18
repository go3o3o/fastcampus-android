package com.example.aop_part5_chapter06.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aop_part5_chapter06.R
import com.example.aop_part5_chapter06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initView()
        initWorker()
    }

    private fun initView() {
        val navigationController =
            (supportFragmentManager.findFragmentById(R.id))
    }
}