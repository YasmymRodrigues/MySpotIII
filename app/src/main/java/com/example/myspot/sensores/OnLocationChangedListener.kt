package com.example.myspot.sensores

import com.google.android.gms.location.LocationResult

interface OnLocationChangedListener {

    fun onLocationChanged(locationResult: LocationResult)
}