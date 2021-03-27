package com.steve28.composepractice2.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import com.steve28.composepractice2.elements.*
import com.steve28.composepractice2.theme.*
import com.steve28.composepractice2.utils.ComposeUtils
import com.steve28.composepractice2.utils.Utils

object MainComponent {
    private val cardSize = 70.dp
    private val primaryVar = color.primaryVariant

    @Composable
    fun Main() {
        PeriodicTableComponent()
    }

    @Composable
    fun PeriodicTableComponent() {
        val state = rememberScrollState()

        SteveTheme {
            ComposeUtils.RowGrid(
                columnSize = 9,
                state = state,
                backgroundColor = primaryVar
            ) { period ->
                if (period != 7) TableRow(period-period/7)
                else Row { repeat(18) {
                    BaseElementItem(0.5)
                } }
            }
        }
    }

    @Composable
    fun ElementItem(element: Element) {
        BaseElementItem(clickEvent = {
            Utils.log(element.name)
        }) {
            with(element) {
                Text(
                    text = index.toString(),
                    color = Color.White,
                    fontSize = 12.sp
                )
                Column {
                    Text(
                        text = symbol,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontSize = 21.sp
                    )
                    Text(
                        text = name,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontSize = 12.sp
                    )
                    ComposeUtils.Space(7.dp)
                    Divider(color = kind.color, thickness = 1.5.dp, startIndent = 7.dp)
                }
            }
        }
    }

    @Composable
    fun BaseElementItem(
        height: Double = 1.0,
        clickEvent: (() -> Unit)? = null,
        content: @Composable () -> Unit = {}
    ) {
        val modifier = clickEvent?.run { Modifier.clickable { this() } } ?: Modifier

        Box(
            modifier =
            modifier
                .width(cardSize)
                .height(cardSize *height.toFloat())
                .background(primaryVar)
        ) { content() }
    }

    @Composable
    fun SpecialPeriod(type: TableType) {
        val (start, end) = when (type) {
            TableType.Lanthanum -> listOf(57, 71)
            TableType.Actinium -> listOf(89, 103)
            else -> listOf(0, 0)
        }
        val startElem = PeriodicTable.elems[start]
        val endElem = PeriodicTable.elems[end]

        BaseElementItem {
            Column {
                Text(
                    text = "$start - $end",
                    color = Color.White,
                    fontSize = 12.sp
                )
                Text(
                    text = "${startElem.symbol} - ${endElem.symbol}",
                    color = Color.White,
                    fontSize = 12.sp
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
                    TableType.None -> { BaseElementItem() }
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