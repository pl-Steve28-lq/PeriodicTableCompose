package com.steve28.composepractice2

data class Element(
    val index: Int,
    val name: String,
    val symbol: String
) {
    companion object {
        val None = Element(0, "", "")
    }
}
