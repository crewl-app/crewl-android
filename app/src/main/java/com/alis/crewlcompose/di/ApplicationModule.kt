/**
 * @author Kaan Fırat
 * @version 1.0, 29/01/23
 */

package com.alis.crewlcompose.di

import com.alis.crewlcompose.app.MainApplication
import com.alis.crewlcompose.app.MainNetworkConfig
import com.alis.framework.app.AppInitializer
import com.alis.framework.app.AppInitializerImpl
import com.alis.framework.app.NetworkConfig
import com.alis.framework.app.TimberInitializer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {
    @Provides
    @Singleton
    fun provideApplication(): MainApplication = MainApplication()

    @Provides
    @Singleton
    fun provideAppInitializer(timberInitializer: TimberInitializer): AppInitializer = AppInitializerImpl(timberInitializer)

    @Provides
    @Singleton
    fun provideNetworkConfig(): NetworkConfig = MainNetworkConfig()

    @Provides
    @Singleton
    fun provideTimberInitializer(networkConfig: NetworkConfig) = TimberInitializer(networkConfig.isDev())
}