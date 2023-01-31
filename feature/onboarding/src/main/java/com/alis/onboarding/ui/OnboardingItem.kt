package com.alis.onboarding.ui

import androidx.annotation.DrawableRes
import com.alis.theme.R

sealed class OnboardingItem(
    @DrawableRes val image: Int,
    val title: String,
    val description: String
) {
    object First: OnboardingItem(
        image = R.drawable.ic_launcher_background,
        title = "",
        description = ""
    )

    object Second: OnboardingItem(
        image = R.drawable.ic_launcher_background,
        title = "",
        description = ""
    )

    object Third: OnboardingItem(
        image = R.drawable.ic_launcher_background,
        title = "",
        description = ""
    )

    object Fourth: OnboardingItem(
        image = R.drawable.ic_launcher_background,
        title = "",
        description = ""
    )
}