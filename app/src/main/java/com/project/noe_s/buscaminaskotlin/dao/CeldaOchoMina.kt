package com.project.noe_s.buscaminaskotlin.dao

import com.project.noe_s.buscaminaskotlin.R

data class CeldaOchoMina(val positionX: Number, val positionY: Number) : CeldaDao(positionX, positionY, "8", R.color.secondaryTextColor ,
    R.drawable.celda_cinco_mina) {

}