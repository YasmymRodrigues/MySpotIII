package com.example.myspot

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class CarDetalhesFragment : Fragment() {

    private val TAG = CarDetalhesFragment::class.java.simpleName


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car_detalhes, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val posicao = arguments?.getInt("position")
        val createFlag = arguments?.getBoolean("create")
        Log.i(TAG, "abri o detalheCar na posicao$posicao")
        val deleteBtn = getView()?.findViewById<Button>(R.id.deleteButton)
        //Botão existe && Eu vou criar meu objeto da lista == Botão desaparece
        if (deleteBtn != null && createFlag == true) {
            deleteBtn.visibility = View.GONE
        }
    }
}