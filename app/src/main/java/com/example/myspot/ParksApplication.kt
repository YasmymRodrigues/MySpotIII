package com.example.myspot

import android.app.Application
import com.example.myspot.sensores.FusedLocation

class ParksApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        FusedLocation.start(this)
    }

}