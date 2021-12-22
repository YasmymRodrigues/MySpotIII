package com.example.myspot

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.PermissionChecker.checkSelfPermission

abstract class PermissionedFragment(private val requestCode: Int) : Fragment() {


    @SuppressLint("WrongConstant")
    fun onRequestPermissions(context: Context, permissions: Array<String>) {
        var permissionsGiven = 0
        permissions.forEach {
            if (checkSelfPermission(context, it) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(permissions, requestCode)
            } else {
                permissionsGiven++
            }
        }
        if (permissionsGiven == permissions.size)
            onRequestPermissionsSuccess()
    }

    abstract fun onRequestPermissionsSuccess()
    abstract fun onRequestPermissionsFailure()

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (this.requestCode == requestCode) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                onRequestPermissionsSuccess()
            } else {
                onRequestPermissionsFailure()
            }
        }
    }
}