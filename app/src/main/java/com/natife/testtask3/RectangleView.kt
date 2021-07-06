package com.natife.testtask3

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

/**
 *@author admin
 */
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


    // лефт - расстояние от левого края - начало
    // топ - расстояние от верха - начало
    // райт - (лефт - райт ) = ширина прямоугольника
    // баттом - (топ - баттом) = высота
    private val rectF = RectF(100F, 100F, 150F, 500F)


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
                mColorStroke = getInt(R.styleable.RectangleView_mColorStroke,Color.BLACK)
            } finally {
                recycle()
            }
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        initPaint()
        initCanvas(canvas)
//        paint.color = Color.RED // цвет линии
//        paint.style = Paint.Style.STROKE
////        paint.strokeWidth = mStrokeWidth // толщина линии
//        paint.strokeWidth = 10F // толщина линии
//
//
////        rect.set(250,300,350,500)
////        canvas.drawRect(rect, paint)
//        canvas.drawRoundRect(rectF, 10F, 10F,paint)

    }
    private fun initPaint(){
//        paint.color = Color.RED // цвет линии
        paint.color = mColorStroke
        paint.style = Paint.Style.STROKE
//        paint.strokeWidth = mStrokeWidth // толщина линии
//        paint.strokeWidth = 10F // толщина линии
        paint.strokeWidth = mStrokeWidth
    }

    private fun initCanvas(canvas: Canvas){
        canvas.drawRoundRect(rectF, mRoanding, mRoanding,paint)

    }

//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//    }
}
