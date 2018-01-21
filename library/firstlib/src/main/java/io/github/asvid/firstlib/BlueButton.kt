package io.github.asvid.firstlib

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.widget.Button

class BlueButton : Button {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        setBackgroundColor(Color.BLUE)
    }

}