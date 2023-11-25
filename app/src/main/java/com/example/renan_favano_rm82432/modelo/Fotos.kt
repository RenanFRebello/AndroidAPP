package com.example.renan_favano_rm82432.modelo

data class Fotos (
  val drone : String,
  val loc : String,
  val lavoura : String,
  val pragas : String,
  val adubo : String,
) {
  fun add(fotos: Fotos) {
      fotos.add(fotos)
  }
}



