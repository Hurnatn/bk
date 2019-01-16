package com.project.noe_s.buscaminaskotlin.dao

import com.project.noe_s.buscaminaskotlin.R

data class CeldaSeisMina(val positionX: Number, val positionY: Number) : CeldaDao(positionX, positionY, "6", R.color.secondaryTextColor ,
    R.drawable.celda_cinco_mina) {

}