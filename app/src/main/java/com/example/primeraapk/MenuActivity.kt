package com.example.primeraapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.primeraapk.IMC.IMCActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val btnIMC = findViewById<Button>(R.id.btnIMC)

        btnSaludar.setOnClickListener {navigatteToSaludar()}
        btnIMC.setOnClickListener {navigatteToIMC()}
    }

    private fun navigatteToIMC() {
        val intent = Intent(this, IMCActivity::class.java)
        startActivity(intent)
    }

    private fun navigatteToSaludar(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}