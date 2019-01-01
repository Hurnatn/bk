package com.project.noe_s.buscaminaskotlin.model

import android.app.ActionBar
import android.content.Context
import android.view.View
import android.widget.TableRow
import com.project.noe_s.buscaminaskotlin.dao.CeldaDao
import com.project.noe_s.buscaminaskotlin.dao.CustomButton
import com.project.noe_s.buscaminaskotlin.play.presenter.BuscaminasPresenter


class BuscaminasModel(){

    fun crearTabla(context: Context, presenter: BuscaminasPresenter, dificultad: String): List<View>{

        val celda = CeldaDao(1, 1, celdaValue = "prueba")


        val lista: MutableList<View> = mutableListOf()

        val myCustomButton: CustomButton = CustomButton(context, celda)

        myCustomButton.width = ActionBar.LayoutParams.MATCH_PARENT
        myCustomButton.height = ActionBar.LayoutParams.MATCH_PARENT

        myCustomButton.myOnclick {
            presenter.calcularCeldaItem(it)
        }


        val tableRow: TableRow = TableRow(context)

        tableRow.addView(myCustomButton)

        lista.add(tableRow)

        return lista
    }

    fun calcularPuntuacion() : String {

        return "Puntuacion"
    }

    fun revelarCelda(button: CustomButton): CustomButton{
        button.text = "12"
        return button
    }

}