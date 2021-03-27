package com.steve28.composepractice2

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.*
import com.steve28.composepractice2.theme.SteveTheme
import kotlin.math.min

object MainComponent {
    private val cardSize = 70.dp
    private val primary
        get() = SteveTheme.colors().primary
    private val primaryVar
        get() = SteveTheme.colors().primaryVariant

    @Composable
    fun Main() {
        PeriodicTableComponent()
    }

    @Composable
    fun PeriodicTableComponent() {
        val scroll = rememberScrollState()
        val period = (0..9).toList()

        SteveTheme {
            LazyColumn(
                modifier = Modifier.horizontalScroll(scroll)
            ) {
                items(period) { period ->
                    if (period != 7) TableRow(period-period/7)
                    else Row { repeat(18) {
                        EmptyElementItem(0.5)
                    } }
                }
            }
        }
    }

    @Composable
    fun ElementItem(element: Element) {
        Card(
            modifier =
            Modifier
                .width(cardSize)
                .height(cardSize)
                .background(primary)
                .clickable { MainActivity.log(element.name) }
        ) {
            Column(
                modifier =
                Modifier.background(primary)
            ) {
                with(element) {
                    Text(
                        text = "$index $symbol",
                        color = Color.White
                    )
                }
            }
        }
    }

    @Composable
    fun EmptyElementItem(height: Double = 1.0) {
        Card(
            modifier =
            Modifier
                .width(cardSize)
                .height(cardSize*height.toFloat())
        ) {}
    }

    @Composable
    fun SpecialPeriod(type: TableType) {
        val (start, end) = when (type) {
            TableType.Lanthanum -> listOf(57, 71)
            TableType.Actinium -> listOf(89, 103)
            else -> listOf(0, 0)
        }

        Card(
            modifier =
            Modifier
                .width(cardSize)
                .height(cardSize)
                .background(primary)
        ) {
            Column(
                modifier =
                Modifier.background(primary)
            ) {
                Text(
                    text = "$start - $end",
                    color = Color.White
                )
            }
        }
    }

    @Composable
    fun TableRow(period: Int) {
        Row {
            repeat(18) { group ->
                val index = period*18 + group
                when (val type = PeriodicTable.type[index]) {
                    TableType.None -> { EmptyElementItem() }
                    TableType.Element -> {
                        ElementItem(PeriodicTable.items[index])
                    }
                    TableType.Lanthanum,
                    TableType.Actinium -> { SpecialPeriod(type) }
                }
            }
        }
    }
}