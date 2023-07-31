package com.example.primeraapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResultado.text = "Hola, $name"

    }

}