package com.natife.testtask3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.setPadding


class MainActivity : AppCompatActivity() {
    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val mVerticalLinearLayout = findViewById<VerticalLinearLayout>(R.id.verticalLinearLayout)
//        val layoutInflater = layoutInflater
//        val tag = "Text"
//        val tagView: View = layoutInflater.inflate(R.layout.linear_layout, null, false)
//        val tagTextView = tagView.findViewById<View>(R.id.tagTextView) as TextView
//        tagTextView.text = tag
//        mVerticalLinearLayout.addView(tagView)

        val mCustomLinearLayout = findViewById<CustomLinearLayout>(R.id.customLinearLayout)
        mCustomLinearLayout.addIteme("WTF")
        mCustomLinearLayout.addIteme("WTF1111")
        mCustomLinearLayout.addIteme("WTF111332324241")

    }
}
