package com.project.noe_s.buscaminaskotlin.play.presenter

import android.content.Context
import android.view.View
import android.widget.Button
import com.project.noe_s.buscaminaskotlin.dao.CustomButton
import com.project.noe_s.buscaminaskotlin.model.BuscaminasModel
import com.project.noe_s.buscaminaskotlin.play.view.BuscaminasView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class BuscaminasPresenter(val buscaminasView: BuscaminasView, val buscaminasModel: BuscaminasModel){

    fun calcularCelda(positionX: String, positionY: String){

        doAsync {
            val puntuacion = buscaminasModel.calcularPuntuacion()

            uiThread {
                buscaminasView.mostrarPuntuacion(puntuacion)
            }
        }

    }

    fun calcularCeldaItem(button: CustomButton) : CustomButton{
        return buscaminasModel.revelarCelda(button)
    }

    fun crearTabla(context: Context, dificultad: String){
        buscaminasView.crearTabla(buscaminasModel.crearTabla(context, this, dificultad))
    }



}