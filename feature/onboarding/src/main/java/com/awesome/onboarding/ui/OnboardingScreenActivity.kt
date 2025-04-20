package com.awesome.onboarding.ui

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.awesome.core_navigation.ActivityConstant
import com.awesome.core_navigation.ActivityHelper
import com.awesome.onboarding.databinding.ActivityOnboardingScreenBinding

class OnboardingScreenActivity : AppCompatActivity(), OnboardingContract {
    private lateinit var binding: ActivityOnboardingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOnboardingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        renderUI()
    }

    override fun renderUI() {
        super.renderUI()
        Handler(mainLooper).postDelayed({
            ActivityHelper.openActivity(
                this@OnboardingScreenActivity,
                ActivityConstant.FEATURE_LOGIN
            )
        }, 2000)
    }
}