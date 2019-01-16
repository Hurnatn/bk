package com.project.noe_s.buscaminaskotlin.dao

import com.project.noe_s.buscaminaskotlin.R

data class CeldaNueveMina(val positionX: Number, val positionY: Number) : CeldaDao(positionX, positionY, "9", R.color.secondaryTextColor ,
    R.drawable.celda_cinco_mina) {

}