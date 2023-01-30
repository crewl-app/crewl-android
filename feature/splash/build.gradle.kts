import extensions.*

plugins {
    id("commons.android-library")
    id("commons.dagger-hilt")
    id("org.jetbrains.kotlin.android")
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.0")
    implementation("com.google.android.material:material:1.4.0")
    FRAMEWORK
    DOMAIN

    addCommonDependencies()

    implementation(SupportLib.Splashscreen)
    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
}