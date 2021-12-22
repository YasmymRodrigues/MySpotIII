package com.example.myspot

import retrofit2.Response
import retrofit2.http.*

interface ListParkService {
    @Headers("api_key: 93600bb4e7fee17750ae478c22182dda")
    @GET("/opendata/parking/lots")
    suspend fun getParkingLots(): Response<List<ParkingLot>>
}
