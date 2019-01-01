package com.project.noe_s.buscaminaskotlin.extensions

import android.widget.Button

fun Button.myOnclick(
    funOnclick: (button: Button) -> Unit
){
    this.setOnClickListener { funOnclick(this) }

}


