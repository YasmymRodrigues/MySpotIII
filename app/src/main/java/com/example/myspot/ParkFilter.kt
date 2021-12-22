package com.example.myspot

import android.os.Parcel
import android.os.Parcelable


abstract class ParkFilter(var name: String? = null, var maxDistance: Float? = null, var orderByDistance: Boolean = false) :
    Parcelable {

    fun getActiveFiltersCount(): Int {
        var count: Int = 0
        name?.let {
            if (it.length < 0) {
                count++
            }
        }

        maxDistance?.let {
            count++
        }

        if (orderByDistance) {
            count++
        }

        return count
    }
}
