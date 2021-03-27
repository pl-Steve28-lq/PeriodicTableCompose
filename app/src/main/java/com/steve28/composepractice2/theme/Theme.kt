package com.steve28.composepractice2.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val middle = Color(0xff4c4c4c)
private val light = Color(0xff787878)
private val dark = Color(0xff242424)

private val DarkColorPalette = darkColors(
    primary = middle,
    primaryVariant = light,
    secondary = purple200
)

private val LightColorPalette = lightColors(
    primary = middle,
    primaryVariant = dark,
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