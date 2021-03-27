package com.steve28.composepractice2.utils

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.*

object ComposeUtils {
    @Composable
    fun Space(dp: Dp) {
        Spacer(modifier = Modifier.height(dp))
    }

    @Composable
    fun RowGrid(
        columnSize: Int,
        state: ScrollState,
        backgroundColor: Color,
        row: @Composable (Int) -> Unit
    ) {
        Box(
            modifier = Modifier
                .background(backgroundColor)
                .fillMaxSize()
        ) {
            LazyColumn(
                modifier = Modifier.horizontalScroll(state)
            ) {
                items((0..columnSize).toList()) {
                    row(it)
                }
            }
        }
    }
}