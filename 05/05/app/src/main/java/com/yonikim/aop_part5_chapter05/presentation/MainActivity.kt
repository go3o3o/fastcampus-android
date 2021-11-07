package com.yonikim.aop_part5_chapter05.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.yonikim.aop_part5_chapter05.R
import com.yonikim.aop_part5_chapter05.databinding.ActivityMainBinding
import com.yonikim.aop_part5_chapter05.extensions.toGone
import com.yonikim.aop_part5_chapter05.extensions.toVisible
import com.yonikim.aop_part5_chapter05.presentation.stationarrivals.StationArrivalsFragmentArgs

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val navigationController by lazy {
        (supportFragmentManager.findFragmentById(R.id.mainNavigationHostContainer) as NavHostFragment).navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViews()
        bindViews()
    }

    override fun onSupportNavigateUp(): Boolean {
        return navigationController.navigateUp() || super.onSupportNavigateUp()
    }

    private fun initViews() = with(binding) {
        setSupportActionBar(toolbar)
        setupActionBarWithNavController(navigationController)
    }

    private fun bindViews() = with(binding) {
        navigationController.addOnDestinationChangedListener { _, destination, argument ->
            if (destination.id == R.id.station_arrivals_dest) {
                title = StationArrivalsFragmentArgs.fromBundle(argument!!).station.name
                toolbar.toVisible()
            } else {
                toolbar.toGone()
            }
        }
    }
}