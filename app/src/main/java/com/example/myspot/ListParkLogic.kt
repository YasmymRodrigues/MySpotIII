package com.example.myspot

import com.example.myspot.repository.ParkRepository
import kotlinx.coroutines.InternalCoroutinesApi

class ListParkLogic(private val repository: ParkRepository) {


    private val storage = ListStoragePark.getInstance()


    fun getParks(): List<Park> {
        return storage.getAll()
    }

    fun insertPark(display: String, symbol:String):String{

        return ""
    }

    fun onClickSymbol(){}
}