package com.alis.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable

@SuppressLint("ConflictingOnColor")
private val DarkColorPalette = darkColors(
    primary = SoftPeach,
    primaryVariant = Black,
    onPrimary = White,
    secondary = Black,
    secondaryVariant = SoftPeach,
    onSecondary = Black,

    background = BackgroundDark,
    onBackground = BackgroundDark,

    surface = SoftPeach,
    onSurface = SoftPeach
)

@SuppressLint("ConflictingOnColor")
private val LightColorPalette = lightColors(
    primary = White,
    primaryVariant = SoftPeach,
    onPrimary = Black,
    secondary = SoftPeach,
    secondaryVariant = SoftPeach,
    onSecondary = Black,

    background = BackgroundLight,
    onBackground = BackgroundLight,

    surface = White,
    onSurface = White
)

val CrewlColors: Colors
    @Composable get() = MaterialTheme.colors

val CrewlShapes: Shapes
    @Composable get() = MaterialTheme.shapes

val CrewlTypography: Typography
    @Composable get() = MaterialTheme.typography

@Composable
fun CrewlTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) DarkColorPalette else LightColorPalette

    val typography = if (darkTheme) DarkTypography else LightTypography

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = Shapes,
        content = content
    )
}