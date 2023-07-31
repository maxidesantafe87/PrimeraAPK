package com.example.primeraapk.IMC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.primeraapk.R
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class IMCActivity : AppCompatActivity() {

    private var seleccionadoHombre:Boolean = true
    private var seleccionadoMujer:Boolean = false



    private  lateinit var viewHombre:CardView
    private  lateinit var viewMujer:CardView
    private  lateinit var tvAltura:TextView
    private  lateinit var selectorAltura:RangeSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        //Preparamos la logica con los metodos.

        iniciarComponentes()
        iniciarEscucha()
        iniciarInterfaz()


    }
private fun iniciarComponentes(){
    viewHombre =  findViewById(R.id.viewHombre)
    viewMujer =  findViewById(R.id.viewMujer)
    tvAltura = findViewById(R.id.tvAltura)
    selectorAltura = findViewById(R.id.selectorAltura)
}
    private fun iniciarEscucha() {
        viewHombre.setOnClickListener {
            seleccionadoHombre = true
            seleccionadoMujer = false
            colorPorGenero()
        }
        viewMujer.setOnClickListener {
            seleccionadoHombre = false
            seleccionadoMujer = true
            colorPorGenero()
        }

        selectorAltura.addOnChangeListener { _, value, _ ->
            val formateo = DecimalFormat("#.##")
            val resultado = formateo.format(value)
        tvAltura.text = "$resultado cm"
        }
    }


    private fun cambiarGenero(){

        seleccionadoHombre = !seleccionadoHombre
        seleccionadoMujer = !seleccionadoMujer
    }

    private fun colorPorGenero() {
        viewHombre.setCardBackgroundColor(getBackgroundColor(seleccionadoHombre))
        viewMujer.setCardBackgroundColor(getBackgroundColor(seleccionadoMujer))
    }

    private fun getBackgroundColor(componenteSeleccionado: Boolean): Int {
        val colorReferencia = if (componenteSeleccionado) {
            R.color.background_component
        } else {
            R.color.background_component_SELECTED

        }

        return ContextCompat.getColor(this, colorReferencia)
    }

    private fun  iniciarInterfaz(){
        colorPorGenero()
    }

}