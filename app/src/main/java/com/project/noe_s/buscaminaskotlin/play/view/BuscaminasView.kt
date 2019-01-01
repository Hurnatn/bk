package com.project.noe_s.buscaminaskotlin.play.view

import android.view.View
import android.widget.Button

interface BuscaminasView{

    fun crearTabla(list: List<View>)

    fun showIndeterminateProgress()

    fun hideIndeterminateShowProgress()

    fun revelarCelda(button: Button)

    fun mostrarPuntuacion(puntuacion: String)

}