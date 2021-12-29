package com.example.myspot

import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_parks_detalhes.*
import com.example.myspot.ParkingLot

class DetalhesFragmentListPark : Fragment() {
    private val TAG = DetalhesFragmentListPark::class.java.simpleName
    var dadosParks: Park? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detalhes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val posicao = arguments?.getInt("position")
        Log.i(TAG, "abri o detalhe na posicao$posicao")
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

       dadosParks = arguments?.getParcelable("pesquisa")
        
        nomedopark.text = dadosParks!!.nome
        distanciadopark.text = dadosParks!!.longitude.toString()
        lastupdateparks.text = dadosParks!!.dataOcupacao
        tipoparks.text = dadosParks!!.tipo
        totalParks.text = dadosParks!!.ocupacao.toString()
        availablePark.text = dadosParks!!.activo.toString()

        closeButton.setOnClickListener {
            NavigationManager.goToListParksFragment(requireActivity().supportFragmentManager)
        }
    }*/
}


