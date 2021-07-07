package com.natife.testtask3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCustomLinearLayout = findViewById<CustomLinearLayout>(R.id.customLinearLayout)
        mCustomLinearLayout.addItem("TextView - One")
        mCustomLinearLayout.addItem("TextView - Two")
        mCustomLinearLayout.addItem("TextView - Three")
    }
}
