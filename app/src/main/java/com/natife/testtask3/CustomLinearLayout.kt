package com.natife.testtask3

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.setPadding


class CustomLinearLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.linear_layout, this, true)
        orientation = VERTICAL

    }
    fun  addIteme(text: String){
        val textView = TextView(context)
        textView.textSize = 18F
//        textView.setTextColor(Color.BLACK)
        textView.setPadding(4)
        textView.text = "WTF"
        addView(textView)
    }


    override fun addView(child: View?) {
        super.addView(child)
    }
}
