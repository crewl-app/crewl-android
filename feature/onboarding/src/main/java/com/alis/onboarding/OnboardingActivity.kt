package com.alis.onboarding

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.fragment.app.FragmentActivity
import com.alis.provider.LanguageProvider
import com.alis.system.SetupSystemUi
import com.alis.theme.CrewlColors
import com.alis.theme.CrewlTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnboardingActivity : FragmentActivity() {
    @Inject
    lateinit var languageProvider: LanguageProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            languageProvider.setLocale(languageProvider.getLanguageCode(), LocalContext.current)
        }
    }
}

@Composable
private fun OnboardingRoot() {
    CrewlTheme {
        SetupSystemUi(systemUiController = rememberSystemUiController(), systemColor = CrewlColors.primary)
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = CrewlColors.background
        ) {
        }
    }
}