package com.example.variedadeskimberlymodulo3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InitialPage : AppCompatActivity() {
    lateinit var btnLoginCliente: Button
    lateinit var btnLoginEmpleado: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial_page)
        btnLoginCliente = findViewById(R.id.btnLoginCliente)
        btnLoginEmpleado = findViewById(R.id.btnLoginEmpleado)

        btnLoginCliente.setOnClickListener(){

        }

        btnLoginEmpleado.setOnClickListener(){

        }
    }
}