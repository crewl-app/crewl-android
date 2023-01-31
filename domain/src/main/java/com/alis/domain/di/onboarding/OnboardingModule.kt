package com.alis.domain.di.onboarding

import android.annotation.SuppressLint
import com.alis.domain.usecase.onboarding.ReadOnboardingUseCase
import com.alis.domain.usecase.onboarding.SaveOnboardingUseCase
import com.alis.repository.onboarding.OnboardingRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@SuppressLint("VisibleForTests")
@Module
@InstallIn(SingletonComponent::class)
class OnboardingModule {
    @Singleton
    @Provides
    fun provideSaveOnboardingUseCase(repository: OnboardingRepository): SaveOnboardingUseCase = SaveOnboardingUseCase(repository = repository)

    @Singleton
    @Provides
    fun provideReadOnboardingUseCase(repository: OnboardingRepository): ReadOnboardingUseCase = ReadOnboardingUseCase(repository = repository)
}
