package com.example.myspot

import android.os.Parcelable
import androidx.room.Entity
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity
@Parcelize
data class Park(var id: String, var nome: String, var activo: Boolean, var cap_max: Int,
                var ocupacao: Int, var dataOcupacao: String, var latitude: Double,
                var longitude: Double, var tipo: String):
    Parcelable {

    var uuid: String = UUID.randomUUID().toString()


    fun latLng(): LatLng? {
        if(latitude != null && longitude != null) {
            return LatLng(latitude, longitude)
        }
        return null
    }

    override fun toString(): String {
        //return "$id;$nome;$activo;$cap_max;$ocupacao;$dataOcupacao;$latitude;$longitude;$tipo"
        return "Pesquisa: $nome;" + "\n" +
                "Tipo: $tipo"
    }

}