import extensions.*

plugins {
    id("commons.android-library")
    id("dagger.hilt.android.plugin")
    id("codeanalyzetools.jacoco-report")
}

dependencies {
    FRAMEWORK
    //MODEL
    LOCAL
    //REMOTE
    REPOSITORY

    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
    implementation(SupportLib.Paging)
}