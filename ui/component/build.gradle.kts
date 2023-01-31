import extensions.SYSTEM
import extensions.THEME

plugins {
    id("commons.android-library")
    id("commons.android-compose")
}

dependencies {
    THEME
    SYSTEM
}