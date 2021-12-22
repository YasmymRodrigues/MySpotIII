package com.example.myspot

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit

class ListParkWSLogic(private val retrofit: Retrofit) {

    /*fun AuthenticateParkLot(){
        val service = retrofit.create(AuthService::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.listOfParkLots(ListOfParkLots(id_parque, nome,
                                                                    activo,
                                                                    id_entidade,
                                                                    capacidade_max,
                                                                    ocupacao,
                                                                    data_ocupacao,
                                                                    latitude,
                                                                    longitude,
                                                                    tipo))
            if(response.isSuccessful){

            }else{

            }
        }
    }*/
}

