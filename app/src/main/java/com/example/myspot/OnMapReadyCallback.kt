package com.example.myspot

import android.widget.Toast
import com.example.myspot.sensores.FusedLocation
import com.google.android.gms.location.LocationResult
import com.google.android.gms.maps.GoogleMap

interface OnMapReadyCallback {

    /*override fun onRequestPermissionsSucess(){
        FusedLocation.registerListener(this)
        map_view.getMapAsync(this)
        map_view.onResume()
    }

    override fun onRequestPermissionsFailure(){
        //create a toast here com mensagem de erro
    }

    override fun onMapReady(map: GoogleMap?){
        this.map = map
    }

    override fun onLocationChanged(locationResult: LocationResult){
        val location = locationResult.lastLocation
    }*/
}