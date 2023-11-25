package com.example.renan_favano_rm82432.ui.mainactivity

import ListaFotos
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.renan_favano_rm82432.DAO.FotosDAO
import com.example.renan_favano_rm82432.R
import com.example.renan_favano_rm82432.modelo.Fotos
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Sejam Bem Vindos!", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)
      //  val drone = findViewById<TextView>(R.id.drone)
      //  drone.text = "Drone1"
      //  val loc = findViewById<TextView>(R.id.localizacao)
      //  loc.text = "195510S435616WID123"
      //  val cultura = findViewById<TextView>(R.id.lavoura)
      //  cultura.text = "Soja"
      //  val doenca = findViewById<TextView>(R.id.pragas)
      //  doenca.text = "Fungos"
      //  val adubo = findViewById<TextView>(R.id.adubo)
      //  adubo.text = "Antifungos"

    }

    override fun onResume() {
        super.onResume()
        val rview = findViewById<RecyclerView>(R.id.Rview)
        val dao = FotosDAO()
        rview.adapter = ListaFotos(context = this, fotos = dao.buscar() )
        val fabb = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fabb.setOnClickListener {
            val intent =  Intent(this,RegistroFotosActivity::class.java)
            startActivity(intent)
        }
    }



}