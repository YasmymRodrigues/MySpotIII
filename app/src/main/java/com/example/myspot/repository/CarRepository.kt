package com.example.myspot.repository

import com.example.myspot.ui.Car

interface CarRepository {

    suspend fun insertCar(marca: String, modelo: String, data: String, matricula: String): Long

    suspend fun updateCar(id: Int, marca: String, modelo:String, matricula: String)

    suspend fun deleteCar(id: Int)

    suspend fun deleteAllCars()

    suspend fun getAllCars(): List<Car>
}