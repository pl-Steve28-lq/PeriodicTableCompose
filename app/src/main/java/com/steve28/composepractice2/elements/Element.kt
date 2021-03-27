package com.steve28.composepractice2.elements

data class Element(
    val index: Int,
    val name: String,
    val symbol: String,
    val kind: ElementKind = ElementKind.Actinides
) {
    companion object {
        val None = Element(0, "", "", ElementKind.Unknown)
    }
}
