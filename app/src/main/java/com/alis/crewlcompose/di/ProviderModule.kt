/**
 * @author Kaan Fırat
 * @version 1.0, 29/01/23
 */

package com.alis.crewlcompose.di

import com.alis.provider.ThemeProvider
import android.content.Context
import com.alis.crewlcompose.provider.AppLanguageProvider
import com.alis.crewlcompose.provider.AppResourceProvider
import com.alis.crewlcompose.provider.AppThemeProvider
import com.alis.framework.preferences.CacheManager
import com.alis.provider.LanguageProvider
import com.alis.provider.ResourceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ProviderModule {
    @Provides
    @Singleton
    fun provideThemeProvider(@ApplicationContext context: Context): ThemeProvider = AppThemeProvider(context)

    @Provides
    @Singleton
    fun provideAppResourceProvider(@ApplicationContext context: Context): ResourceProvider = AppResourceProvider(context)

    @Provides
    @Singleton
    fun provideAppLanguageProvider(cacheManager: CacheManager): LanguageProvider = AppLanguageProvider(cacheManager)
}