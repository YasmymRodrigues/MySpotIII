package com.example.myspot

import com.google.gson.annotations.SerializedName

//@SerializedName(atributo_json) atributoJson: String
data class ParkingLot(val id_parque: String,
                      val nome: String,
                      val activo : Int,
                      val id_entidade : Int,
                      val capacidade_max: Int,
                      val ocupacao: Int,
                      val data_ocupacao: String,
                      val latitude: String,
                      val longitude: String,
                      val tipo: String) {
                            }