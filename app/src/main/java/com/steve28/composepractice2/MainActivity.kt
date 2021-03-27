package com.steve28.composepractice2

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MainComponent.Main() }
    }

    companion object {
        fun log(msg: Any) = Log.d("TAG", msg.toString())
    }
}