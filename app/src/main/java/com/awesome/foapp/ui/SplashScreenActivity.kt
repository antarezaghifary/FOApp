package com.awesome.foapp.ui

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.awesome.core_navigation.ActivityConstant
import com.awesome.core_navigation.ActivityHelper
import com.awesome.foapp.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity(), SplashScreenContract {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        renderUI()
    }

    override fun renderUI() {
        super.renderUI()

        Handler(mainLooper).postDelayed({
            ActivityHelper.openActivity(
                this@SplashScreenActivity,
                ActivityConstant.FEATURE_ONBOARDING
            )
        }, 2000)

    }
}