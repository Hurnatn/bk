package com.project.noe_s.buscaminaskotlin

import android.app.Dialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts
import android.support.annotation.UiThread
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.project.noe_s.buscaminaskotlin.play.BuscaminasActivity
import kotlinx.android.synthetic.main.activity_buscaminas.*
import kotlinx.android.synthetic.main.activity_buscaminas.view.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.async

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        idButtonPlay.setOnClickListener {
            val miLista = listOf("Fácil", "Medio", "Difícil")
            selector("Selecciona la dificultad",  miLista , ({ item, index ->
                startActivity<BuscaminasActivity>("dificultad" to "${index + 1}")
            }))
        }
        idButtonScore.setOnClickListener {
            Toast.makeText(this@MainActivity, "Coming soon", Toast.LENGTH_LONG).show()
            //indeterminateProgressDialog("This a progress dialog"){
               // setCancelable(false)
//                setOnCancelListener { Toast.makeText(this@MainActivity, "Aún está activo el procesoaunque canceles", Toast.LENGTH_LONG).show() }
//                setOnDismissListener { Toast.makeText(this@MainActivity, "Aún está activo el proceso aunque dismissed", Toast.LENGTH_LONG).show() }
//            }
        }

    }

//    override fun onWindowFocusChanged(hasFocus: Boolean) {
//        super.onWindowFocusChanged(hasFocus)
//        if (hasFocus) hideSystemUI()
//    }

    private fun hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }


}
