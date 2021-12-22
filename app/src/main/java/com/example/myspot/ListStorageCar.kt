package com.example.myspot

import com.example.myspot.ui.Car
import kotlinx.coroutines.*

class ListStorageCar private constructor() {

    private val storage = mutableListOf<Car>()

    companion object {
        private var instance: ListStorageCar? = null

        @InternalCoroutinesApi
        fun getInstance(): ListStorageCar {
            kotlinx.coroutines.internal.synchronized(this) {
                if (instance == null) {
                    instance = ListStorageCar()
                }
                return instance as ListStorageCar
            }
        }
    }
    suspend fun insert(car: Car){
        CoroutineScope(Dispatchers.IO).launch {
            Thread.sleep(30000)
            storage.add(car)
        }
    }

    fun getAll():List<Car>{
        return storage.toList()
    }
}