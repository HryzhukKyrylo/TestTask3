package com.natife.testtask3

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class RectangleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defaultStyle: Int = 0
) : View(context, attrs, defaultStyle) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val rect = Rect()

    private var mRoanding = 0F
    private var mStrokeWidth = 0F
    private var mColorStroke = Color.BLACK

    init {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.RectangleView,
            0, 0
        ).apply {

            try {
                // считываем с макета значения
                mStrokeWidth = getFloat(R.styleable.RectangleView_mStrokeWidth, 0F)
                mRoanding = getFloat(R.styleable.RectangleView_mRoanding, 0F)
                mColorStroke = getInt(R.styleable.RectangleView_mColorStroke, Color.BLACK)
            } finally {
                recycle()
            }
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        initPaint()
        initCanvas(canvas)
    }

    private fun initPaint() {
        paint.color = mColorStroke
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = mStrokeWidth
    }

    private fun initCanvas(canvas: Canvas) {
        val rectF = RectF(
            mRoanding,
            mRoanding,
            canvas.width.toFloat() - mRoanding,
            canvas.height.toFloat() - mRoanding
        )
        canvas.drawRoundRect(rectF, mRoanding, mRoanding, paint)
    }

//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//        val w = MeasureSpec.getSize(widthMeasureSpec)
//    }
}
