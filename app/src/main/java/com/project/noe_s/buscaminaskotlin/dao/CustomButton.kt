package com.project.noe_s.buscaminaskotlin.dao

import android.app.ActionBar
import android.content.Context
import android.graphics.Color
import android.widget.Button
import android.widget.RemoteViews
import android.widget.TextView
import com.project.noe_s.buscaminaskotlin.R

@RemoteViews.RemoteView
class CustomButton(context: Context, celda: CeldaDao): Button(context) {

    val celda by lazy { celda }

    init {
        width = ActionBar.LayoutParams.MATCH_PARENT
        height = ActionBar.LayoutParams.MATCH_PARENT
        setPadding(0,0,0,0)
        setBackgroundResource(celda.parentBackground)
        text = celda.parentCeldaValue
        setTextColor(celda.parentTextColor)

    }

    fun myOnclick(
        funOnclick: (button: CustomButton) -> Unit
    ){
        this.setOnClickListener { funOnclick(this) }
    }




}