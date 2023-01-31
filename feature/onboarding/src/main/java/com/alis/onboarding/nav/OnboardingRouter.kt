package com.alis.onboarding.nav

sealed class OnboardingRouter(val route: String) {
    object Onboarding: OnboardingRouter(route = "onboarding_screen")
}