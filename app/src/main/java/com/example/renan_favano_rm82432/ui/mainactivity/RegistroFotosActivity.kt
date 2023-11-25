package com.example.renan_favano_rm82432.ui.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.renan_favano_rm82432.DAO.FotosDAO
import com.example.renan_favano_rm82432.R
import com.example.renan_favano_rm82432.modelo.Fotos

class RegistroFotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_fotos)

        val botaocadastrar = findViewById<Button>(R.id.cadastrar)
        botaocadastrar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val campodrone = findViewById<EditText>(R.id.aduboid)
                val drone = campodrone.text.toString()
                val campoloc = findViewById<EditText>(R.id.Localizaid)
                val local = campoloc.text.toString()
                val campocultura = findViewById<EditText>(R.id.Culturaid)
                val cult = campocultura.text.toString()
                val campopraga = findViewById<EditText>(R.id.Prag)
                val pragg = campopraga.text.toString()
                val campoadubo = findViewById<EditText>(R.id.Localizaid)
                val aduboo = campoadubo.text.toString()

                val fotocriada =  Fotos(drone = drone,loc= local, lavoura = cult, pragas = pragg , adubo = aduboo)
                val dao = FotosDAO().adicionar(fotocriada)
                finish()
            }
        })
    }
}