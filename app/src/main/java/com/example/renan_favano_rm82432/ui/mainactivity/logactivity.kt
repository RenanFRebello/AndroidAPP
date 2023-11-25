package com.example.renan_favano_rm82432.ui.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.renan_favano_rm82432.R


class logactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logactivity)
        val user = findViewById<EditText>(R.id.user)
        val senha = findViewById<EditText>(R.id.senha)
        val botaoentrar = findViewById<Button>(R.id.button)
        botaoentrar.setOnClickListener {
            if(user.isActivated and senha.isActivated) {
                val intent0 = Intent(this, MainActivity::class.java)
                startActivity(intent0)
            }else{
                Toast.makeText(this, "Coloque seus dados", Toast.LENGTH_SHORT).show()
        }
    }
}}