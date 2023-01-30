package com.alis.splash

import android.os.Build
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.lifecycleScope
import com.alis.framework.extension.launchActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest

class SplashActivity : FragmentActivity() {
    private val viewModel by viewModels<SplashViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val splashScreen = installSplashScreen()
            splashScreen.setKeepOnScreenCondition { true }
        }

        super.onCreate(savedInstanceState)

        lifecycleScope.launchWhenCreated {
            viewModel.startOnboarding.collectLatest {
                delay(3000)
            }
        }
    }

    private fun navigate(packageName: String, className: String) {
        launchActivity(packageName = packageName, className = className).also {
            finish()
        }
    }
}