package com.natife.testtask3

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        orientation = VERTICAL

    }

    fun addItem(text: String) {
        val textView = TextView(context)
        textView.textSize = 18F
        textView.setTextColor(Color.parseColor("#ffffff"))
        textView.setBackgroundColor(Color.parseColor("#000000"))
        textView.setPadding(4)
        textView.text = text
        addView(textView)
    }

    override fun addView(child: View?) {
        super.addView(child)
    }
}
