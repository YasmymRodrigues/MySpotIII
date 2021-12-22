package com.example.myspot

import android.app.Application
import androidx.lifecycle.AndroidViewModel

//Do not process data
class CarViewModel(application: Application) : AndroidViewModel(application) {
        //private val CarLogic = CarLogic()
        private var listener: OnListChanged? =  null
        var display: String = ""
        private val storage = CarDatabase.getInstance(application).carDao()
        private val carLogic = CarLogic(storage)


    private fun notifyOnDisplayChanged(){
        listener?.onListChanged()
    }
    fun registerListener(listener: OnListChanged){
        this.listener = listener
        listener?.onListChanged()
    }
    fun unregisterListener(){
        listener = null
    }
    fun onClickSymbol(symbol:String) : String {
        //display = CarLogic.insertSymbol(display, symbol)
        notifyOnDisplayChanged()
        return display
    }
}