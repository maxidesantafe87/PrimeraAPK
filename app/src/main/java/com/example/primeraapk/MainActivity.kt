package com.example.primeraapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.security.KeyChain.EXTRA_NAME
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // comienza mi codigo....

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

    ///        etName.text.toString() devuelve el valor del editText

     btnStart.setOnClickListener{
       val name = etName.text.toString()

        if(name.isNotEmpty()){
           Log.i("Resultado", "Boton Pulsado, $name")

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("EXTRA_NAME", name) // pasamos la clave EXTRA NAME, y pasamos el name
            startActivity(intent) // lleva a la pantalla que creamos

    }
    }
        // Al arrancar la pantalla
}
}