package com.example.myspot

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val fragmentManager: FragmentManager) {
    private val TAG = ContactAdapter::class.java.simpleName

    inner class ViewHolder(itemView: View)  {

        init {
           itemView.setOnClickListener {
                Log.i(TAG,"Contact")
                NavigationManager.goToContact(fragmentManager)
            }
        }
    }
}