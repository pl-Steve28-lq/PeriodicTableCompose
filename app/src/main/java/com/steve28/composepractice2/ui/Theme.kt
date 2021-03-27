package com.steve28.composepractice2.ui

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val middle = Color(0xff4c4c4c)
private val light = Color(0xff787878)
private val dark = Color(0xff2c2c2c)

val color = lightColors(
    primary = middle,
    primaryVariant = dark,
    secondary = light
)

@Composable
fun SteveTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = color,
        content = content
    )
}