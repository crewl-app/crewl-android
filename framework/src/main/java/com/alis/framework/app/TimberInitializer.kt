/**
 * @author Kaan Fırat
 * @version 1.0, 29/01/23
 */

package com.alis.framework.app

import com.alis.framework.platform.isHMS
import timber.log.Timber

class TimberInitializer(private val isDev: Boolean) : AppInitializer {
    override fun initialize(application: CoreApplication) {
        if (isDev)
            Timber.plant(Timber.DebugTree())
        else {
            if (application.applicationContext.isHMS())
                Timber.plant(FirebaseCrashlyticsReportTree())
            else
                Timber.plant(FirebaseCrashlyticsReportTree())
        }
    }
}