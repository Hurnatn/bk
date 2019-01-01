package com.project.noe_s.buscaminaskotlin.play

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TableRow
import com.project.noe_s.buscaminaskotlin.R
import com.project.noe_s.buscaminaskotlin.extensions.myOnclick
import com.project.noe_s.buscaminaskotlin.model.BuscaminasModel
import com.project.noe_s.buscaminaskotlin.play.presenter.BuscaminasPresenter
import com.project.noe_s.buscaminaskotlin.play.view.BuscaminasView
import kotlinx.android.synthetic.main.activity_buscaminas.*

class BuscaminasActivity : AppCompatActivity(), BuscaminasView {

    private val presenter = BuscaminasPresenter(this, BuscaminasModel())

    val dificultad: String by lazy{ intent.extras?.get("dificultad")?.toString() ?: "No he recibido datos"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscaminas)
        //Comprobar: Renderizar elemento
        presenter.crearTabla(this@BuscaminasActivity,dificultad)

    }

    override fun crearTabla(list: List<View>) {
        list.forEach { linearLayout.addView(it) }
    }

    override fun showIndeterminateProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideIndeterminateShowProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun revelarCelda(button: Button) {
        val butttonView = findViewById<Button>(button.id)
        TODO("Modificar el boton existente con el recibido")
    }

    override fun mostrarPuntuacion(puntuacion: String) {
        puntuacionTextView.text = puntuacion ?: "No he recibido nada del Presenter"

    }
}
