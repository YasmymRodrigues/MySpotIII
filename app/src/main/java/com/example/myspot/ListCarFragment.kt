package com.example.myspot

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListCarFragment : Fragment(), OnListChanged {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<CarAdapter.ViewHolder>? = null
    private lateinit var viewModel: CarViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_car, container, false)
        viewModel = ViewModelProvider(this)[CarViewModel::class.java]
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val rvCars = getView()?.findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView
        val fabCars = getView()?.findViewById<FloatingActionButton>(R.id.insertButton)
        if (fabCars != null) {
            fabCars.setOnClickListener {
                NavigationManager.goToDetalhesCar(activity?.supportFragmentManager!!, null, true)
            }
        }

        layoutManager = LinearLayoutManager(activity as Context) //Fragments don't have context like the activities.
        adapter = CarAdapter(parentFragmentManager)

        rvCars.layoutManager = layoutManager
        rvCars.adapter = adapter
    }
    override fun onStart(){
        viewModel.registerListener(this)
        super.onStart()
    }

    override fun onListChanged() {
        //value.let { marca.text = it }
    }

    override fun onDestroy() {
        viewModel.unregisterListener()
        super.onDestroy()
    }
}
