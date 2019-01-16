package com.project.noe_s.buscaminaskotlin.dao

import com.project.noe_s.buscaminaskotlin.R

data class CeldaInicial(val positionX: Number, val positionY: Number) : CeldaDao(positionX, positionY, "", R.color.primaryTextColor ,
    R.drawable.celda_sin_presionar) {

}