package com.project.noe_s.buscaminaskotlin.dao

import android.content.Context
import android.widget.TextView

class CustomButton(context: Context,celdaDao: CeldaDao): TextView(context) {

    val positionX: Number = celdaDao.positionX
    val value: CharSequence = celdaDao.celdaValue

    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(value, type)
    }

    fun myOnclick(
        funOnclick: (button: CustomButton) -> Unit
    ){
        this.setOnClickListener { funOnclick(this) }
    }




}