package com.example.myspot

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myspot.ui.Car

class CarAdapter(val fragmentManager: FragmentManager): RecyclerView.Adapter<CarAdapter.ViewHolder>() {
    private val TAG = CarAdapter::class.java.simpleName
    private var cars = arrayOf(
        Car("Audi", "ASX", "12/12/21", "S12EF"),
        Car("AudiX", "ASX", "12/12/21", "S12EF")
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       /* lateinit var itemModel: TextView
        lateinit var itemMarca: TextView
        lateinit var itemRegistro: TextView*/

        init {
            /*itemModel = itemView.findViewById(R.id.modelInput)
            itemMarca = itemView.findViewById(R.id.brandInput)
            itemRegistro = itemView.findViewById(R.id.registryInput)*/

            itemView.setOnClickListener {
                Log.i(TAG,"Cliquei")
                NavigationManager.goToDetalhesCar(fragmentManager, adapterPosition, false)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_car_list, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       /* holder.itemMarca.text = cars[position].toString()
        holder.itemModel.text = cars[position].toString()
        holder.itemRegistro.text = cars[position].toString()*/
    }


    override fun getItemCount(): Int {
        return cars.size
    }
}