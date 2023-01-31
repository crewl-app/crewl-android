import extensions.*

plugins {
    id("commons.android-library")
    id("dagger.hilt.android.plugin")
    id("codeanalyzetools.jacoco-report")
    id("org.jetbrains.kotlin.android")
}

dependencies {
    FRAMEWORK
    //MODEL
    LOCAL
    //REMOTE

    implementation(DaggerHiltLib.Android)
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.6.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")
    kapt(DaggerHiltLib.Compiler)

    implementation(StorageLib.DatastorePref)
}
android {
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
