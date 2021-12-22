package com.example.myspot.ui

import androidx.room.Entity
import androidx.room.PrimaryKey
//import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "car")
data class Car(
    var marca:String,
    var modelo:String,
    var data: String,
    var matricula: String,
    var id: Int = 0){

//@PrimaryKey(autoGenerate = true)
    @PrimaryKey
    var uuid: String = UUID.randomUUID().toString()


}

