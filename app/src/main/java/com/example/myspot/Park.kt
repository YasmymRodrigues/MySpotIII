package com.example.myspot

import java.util.*

class Park(var id: String, var nome: String, var activo: Boolean, var cap_max: Int, var ocupacao: Int, var dataOcupacao: String, var latitude: Double, var longitude: Double, var tipo: String) {

    var uuid: String = UUID.randomUUID().toString()

    override fun toString(): String {
        //return "$id;$nome;$activo;$cap_max;$ocupacao;$dataOcupacao;$latitude;$longitude;$tipo"
        return "$nome;$tipo"
    }

}