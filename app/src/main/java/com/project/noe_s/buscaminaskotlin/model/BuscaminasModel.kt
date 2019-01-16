package com.project.noe_s.buscaminaskotlin.model

import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TableRow
import com.project.noe_s.buscaminaskotlin.R.drawable.celda_cinco_mina
import com.project.noe_s.buscaminaskotlin.dao.*
import com.project.noe_s.buscaminaskotlin.play.presenter.BuscaminasPresenter
import java.io.Console


class BuscaminasModel(){

    fun crearTabla(context: Context, presenter: BuscaminasPresenter, dificultad: String): List<View>{

        val lista: MutableList<View> = mutableListOf()

        for (x in 1..10) {

            val tableRow: TableRow = TableRow(context)

            tableRow.layoutParams =
                    TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

            for (y in 1..10) {
                val celda = CeldaInicial(x, y)

                val myCustomButton: CustomButton = CustomButton(context, celda)
                myCustomButton.myOnclick {
                    presenter.calcularCeldaItem(it)
                }
                tableRow.addView(myCustomButton)
            }

            lista.add(tableRow)
        }

        return lista
    }

    fun calcularPuntuacion() : String {

        return "Puntuacion"
    }

    fun revelarCelda(button: CustomButton): CustomButton{
        Log.i("Eje x", button.x.toString())
        Log.i("Eje y", button.celda.parentPositionX.toString())
        button.text = "$button.celda.parentPositionX.toString()"
        button.setBackgroundResource(celda_cinco_mina)
        return button
    }

//    fun minas(number: Number): CeldaDao {
//        return when(number){
//            0 -> CeldaInicial(parentPositionX, parentPositionY)
//            1 -> CeldaUnaMina(parentPositionX, parentPositionY)
//            else -> CeldaDosMina(parentPositionX, parentPositionY)
//        }
//    }

}