package com.example.renan_favano_rm82432.DAO

import ListaFotos
import com.example.renan_favano_rm82432.modelo.Fotos

class FotosDAO {

    fun adicionar (fotos: Fotos) {

        fotos.add(fotos)

    }
    fun buscar() : List<Fotos> {

       return Companion.fotos.toList()

    }

    companion object {
        private val fotos = mutableListOf<Fotos>()
    }


}