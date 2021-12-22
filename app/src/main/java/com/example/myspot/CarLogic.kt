package com.example.myspot

import android.media.VolumeShaper
import com.example.myspot.repository.CarRepository
import kotlinx.coroutines.InternalCoroutinesApi

/*
class CarLogic(private val repository: CarRepository) {
}*/
class CarLogic(private val storage: CarDAO) {
    @InternalCoroutinesApi
    //private val storage = ListStorageCar.getInstance()

    fun insertSymbol(display: String, symbol: String): String{
        return ""
    }

}