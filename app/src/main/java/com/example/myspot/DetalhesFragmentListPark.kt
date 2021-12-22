package com.example.myspot

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DetalhesFragmentListPark : Fragment() {
    private val TAG = DetalhesFragmentListPark::class.java.simpleName

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
}



/*override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detalhes, container, false)
        val btnFechar : Button = view.findViewById(R.id.closeButton)
        btnFechar.setOnClickListener{
            val fragment = ListParksFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.frame, fragment)?.commit()
        }
        return view
    }*/