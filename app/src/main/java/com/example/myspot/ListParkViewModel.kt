package com.example.myspot

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.myspot.repository.ParkRepository
import kotlinx.coroutines.*

const val ENDPOINT = "https://emel.city-platform.com/"

class ListParkViewModel : ViewModel() {
    private val parkRepository = ParkRepository()
    //private val listParkLogic = ListParkLogic(parkRepository)
    //private val wsLogic = ListParkWSLogic(RetrofitBuilder.getInstance(ENDPOINT))
    private var listener: ListParkFragment? = null

   fun getAll(): List<Park>{
        val retrofit = RetrofitBuilder.getInstance(ENDPOINT)
        val service = retrofit.create(ListParkService::class.java)
        val parks = mutableListOf<Park>()

       CoroutineScope(Dispatchers.Main).launch {
           withContext(Dispatchers.IO) {
               val response = service.getParkingLots()
               if (response.isSuccessful) {
                   Log.i("TagY", "Success")
                   val parkingLots = response.body()
                   for (parkingLot in parkingLots!!) {
                       val ativo = parkingLot.activo == 1
                       parks.add(
                           Park(
                               parkingLot.id_parque, parkingLot.nome, ativo,
                               parkingLot.capacidade_max, parkingLot.ocupacao,
                               parkingLot.data_ocupacao, parkingLot.latitude.toDouble(),
                               parkingLot.longitude.toDouble(), parkingLot.tipo
                           )
                       )
                   }
                   withContext(Dispatchers.Main) {
                       notifyOnListChanged()
                   }

               }
           }
       }
           return parks
        //return listParkLogic.getParks()
    }

    private fun notifyOnListChanged(){
        listener?.onListChanged()
    }

    fun registerListener(listener: ListParkFragment){
        this.listener = listener
        listener?.onListChanged()
    }

    fun unregisterListener(){
        listener = null
    }

}