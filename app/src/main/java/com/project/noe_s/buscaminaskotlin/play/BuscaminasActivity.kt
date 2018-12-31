package com.project.noe_s.buscaminaskotlin.play

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.UiThread
import com.project.noe_s.buscaminaskotlin.R
import kotlinx.android.synthetic.main.activity_buscaminas.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class BuscaminasActivity : AppCompatActivity() {

    val dificultad: String by lazy{ intent.extras?.get("dificultad")?.toString() ?: "No he recibido datos"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscaminas)
        doAsync {
            Thread.sleep(5000)
            uiThread {
                textView.text = dificultad
            }
        }
       // textView.text = dificultad
    }
}
