package com.example.proyecto_final_upb

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.database
import kotlin.jvm.java
import android.content.Intent


class MainActivity : AppCompatActivity() {

    private val auth = FirebaseAuth.getInstance()
    private val db = Firebase.database.reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val correo = findViewById<EditText>(R.id.txtCorreo)
        val clave = findViewById<EditText>(R.id.txtClave)

        val entrar = findViewById<Button>(R.id.btnEntrar)
        val registro = findViewById<Button>(R.id.btnRegistro)

        entrar.setOnClickListener {
            if (correo.text.isEmpty() || clave.text.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Falta conectar Firebase", Toast.LENGTH_SHORT).show()
            }
        }

        registro.setOnClickListener {
            Toast.makeText(this, "Registro próximamente", Toast.LENGTH_SHORT).show()
        }
    }
}