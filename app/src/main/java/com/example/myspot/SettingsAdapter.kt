package com.example.myspot

import android.media.audiofx.Equalizer
import android.util.Log
import android.view.View
import androidx.fragment.app.FragmentManager

class SettingsAdapter(val fragmentManager: FragmentManager) {

    private val TAG = SettingsAdapter::class.java.simpleName

    inner class ViewHolder(itemView: View)  {

        init {
            itemView.setOnClickListener {
                Log.i(TAG,"Settings")
                NavigationManager.goToSettings(fragmentManager)
            }
        }
    }
}