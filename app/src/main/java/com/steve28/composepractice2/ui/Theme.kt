package com.steve28.composepractice2.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color(0xff1976d2),
    primaryVariant = Color(0xff004ba0),
    secondary = purple200
)

private val LightColorPalette = lightColors(
    primary = Color(0xff63a4ff),
    primaryVariant = Color(0xff004ba0),
    secondary = purple200
)

object SteveTheme {
    var dark = false
    fun colors() = if (dark) DarkColorPalette else LightColorPalette
    fun typography() = typography
    fun shapes() = shapes
}

@Composable
fun SteveTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    SteveTheme.dark = darkTheme
    MaterialTheme(
        colors = SteveTheme.colors(),
        typography = SteveTheme.typography(),
        shapes = SteveTheme.shapes(),
        content = content
    )
}