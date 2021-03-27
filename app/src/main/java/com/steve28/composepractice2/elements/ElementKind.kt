package com.steve28.composepractice2.elements

import androidx.compose.ui.graphics.Color

enum class ElementKind(val color: Color) {
    Alkali          // 알칼리 금속
        (Color.Red),
    Alkaline        // 알칼리 토금속
        (Color(0xff318eff)),
    Transition      // 전이 금속
        (Color(0xffff7b00)),
    PostTransition  // 전이후 금속
        (Color(0xff4754fb)),
    Lanthanides     // 란타넘족
        (Color(0xff008e80)),
    Actinides       // 악티늄족
        (Color(0xff09d626)),
    Metalloid       // 준금속
        (Color(0xffc5020e)),
    NonMetal        // 기타 비금속
        (Color(0xfff0d800)),
    NobleGas        // 비활성 기체
        (Color(0xff8705ec)),
    Halogen         // 할로젠 원소
        (Color(0xff228000)),
    Unknown         // None Element
        (Color.White)
}