package com.example.myspot

import android.os.Parcelable
import androidx.room.Entity
import com.google.android.gms.maps.model.LatLng
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.*

//@SerializedName(atributo_json) atributoJson: String
@Entity
@Parcelize
data class ParkingLot(val id_parque: String,
                      val nome: String,
                      val activo : Int,
                      val id_entidade : Int,
                      val capacidade_max: Int,
                      val ocupacao: Int,
                      val data_ocupacao: String,
                      val latitude: String,
                      val longitude: String,
                      val tipo: String):Parcelable {

    var uuid: String = UUID.randomUUID().toString()


   /* fun latLng(): LatLng? {
        if(latitude != null && longitude != null) {
            return LatLng(latitude, longitude)
        }
        return null
    }*/

    override fun toString(): String {
        //return "$id;$nome;$activo;$cap_max;$ocupacao;$dataOcupacao;$latitude;$longitude;$tipo"
        return "Pesquisa: $nome;" + "\n" +
                "Tipo: $tipo"
    }


}