/**
 * @author Kaan Fırat
 * @version 1.0, 29/01/23
 */

package commons

import extensions.addComposeDependencies

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    addComposeConfig()
}

dependencies {
    // Compose
    addComposeDependencies()
}