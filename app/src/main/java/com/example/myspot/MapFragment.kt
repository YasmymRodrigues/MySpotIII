package com.example.myspot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myspot.sensores.FusedLocation
import com.example.myspot.sensores.OnLocationChangedListener
import com.google.android.gms.location.LocationResult
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import kotlinx.android.synthetic.main.fragment_map.*
import kotlinx.android.synthetic.main.fragment_map.view.*
import java.util.jar.Manifest

const val REQUEST_CODE = 100
class MapFragment : PermissionedFragment(REQUEST_CODE), OnMapReadyCallback, OnLocationChangedListener {

    private var map: GoogleMap?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_map, container, false)
        view.map_view.onCreate(savedInstanceState)
        return view
    }

    override fun onStart() {
        //super.onRequestPermissions(activity?.baseContext!!, arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION))
        super.onStart()
    }

    override fun onRequestPermissionsSuccess() {
        FusedLocation.registerListener(this)
        map_view.getMapAsync(this)
        map_view.onResume()
    }

    override fun onRequestPermissionsFailure(){
        //create a toast here com mensagem de erro
    }

    override fun onLocationChanged(locationResult: LocationResult){
        val location = locationResult.lastLocation
    }

    override fun onMapReady(map: GoogleMap) {
        this.map = map
    }

}