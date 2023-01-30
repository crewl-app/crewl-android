package com.alis.splash

import com.alis.domain.usecase.onboarding.ReadOnboardingUseCase
import com.alis.framework.base.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class SplashViewModel @Inject constructor(private val readOnboardingUseCase: ReadOnboardingUseCase): BaseViewModel() {
    private val _startOnboarding = MutableStateFlow(false)
    val startOnboarding = _startOnboarding.asStateFlow()

    init {
        readOnBoardingState()
    }

    private fun readOnBoardingState() = safeLaunch {
        call(readOnboardingUseCase(Unit)) { isCompleted ->
            _startOnboarding.value = !isCompleted
        }
    }
}