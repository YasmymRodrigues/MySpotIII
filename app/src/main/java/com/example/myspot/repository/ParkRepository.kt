package com.example.myspot.repository

import android.service.autofill.UserData
import com.example.myspot.ListPark
import com.example.myspot.ListParkService
import com.example.myspot.ListStoragePark
import com.example.myspot.Park
import java.util.concurrent.Flow

/*
class ParkRepository(private val local: X, private val remore: Y) {
}*/
class ParkRepository(
        private val exampleRemoteDataSource: ListParkService, // network
        private val exampleLocalDataSource: ListStoragePark // database
) {
        /*val data: Flow<Park> = Park

        suspend fun modifyData(example: Park) { ... }*/



}