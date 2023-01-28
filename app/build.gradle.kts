import extensions.*

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.parcelize")
    id("com.google.devtools.ksp")
    id("org.jetbrains.kotlin.kapt")
    id("codeanalyzetools.quality")
    id("codeanalyzetools.jacoco-report")
}

if (file("google-services.json").exists()) {
    apply(plugin = "com.google.gms.google-services")
    apply(plugin = "com.google.firebase.crashlytics")
}

if (file("agconnect-services.json").exists()) {
    apply(plugin = "com.huawei.agconnect")
}

android {
    compileSdk = Configs.CompileSdk

    defaultConfig {
        applicationId = Configs.Id
        minSdk = Configs.MinSdk
        targetSdk = Configs.TargetSdk
        versionCode = Configs.VersionCode
        versionName = Configs.VersionName
        multiDexEnabled = true
        testInstrumentationRunner = Configs.AndroidJunitRunner
        vectorDrawables.useSupportLibrary = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
        freeCompilerArgs = Configs.FreeCompilerArgs
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.Compose
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1,gradle-plugins}"
        }
    }

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

android.applicationVariants.all {
    val variantName = name
    kotlin.sourceSets {
        getByName("main") {
            kotlin.srcDir(File("build/generated/ksp/$variantName/kotlin"))
        }
    }
}

dependencies {
    /* Todo: Add module dependencies. */

    /* Common */
    addCommonDependencies()

    /* Compose */
    addComposeDependencies()

    /* Navigation */
    addNavigationDependencies()

    /* Network */
    addNetworkDependencies()

    /* Storage */
    addStorageDependencies()

    /* Firebase */
    addFirebaseDependencies()

    /* Huawei */
    addHuaweiDependencies()

    /* Core */
    implementation(SupportLib.Splashscreen)
    implementation(SupportLib.Timber)
    implementation(SupportLib.Paging)

    /* Dagger Hilt */
    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
    implementation(DaggerHiltLib.Compose)

    /* Todo: Add test dependencies. */
}