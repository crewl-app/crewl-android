package com.alis.onboarding.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alis.onboarding.ui.OnboardingScreen

@Composable
fun OnboardingNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = OnboardingRouter.Onboarding.route) {
        composable(route = OnboardingRouter.Onboarding.route) {
            OnboardingScreen()
        }
    }
}