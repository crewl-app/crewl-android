/**
 * @author Kaan Fırat
 * @version 1.0, 29/01/23
 */

package com.alis.framework.app

class AppInitializerImpl(private vararg val initializers: AppInitializer) : AppInitializer {
    override fun initialize(application: CoreApplication) {
        initializers.forEach {
            it.initialize(application = application)
        }
    }
}