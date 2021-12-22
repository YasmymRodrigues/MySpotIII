package com.example.myspot

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class NavigationManager {

    companion object {
        private fun placeFragment(fm: FragmentManager, fragment: Fragment){
            val transition = fm.beginTransaction()
            transition.replace(R.id.frame, fragment)
            transition.addToBackStack(null)
            transition.commit()
        }

        fun goToListParksFragment(fm: FragmentManager){
            placeFragment(fm, ListParkFragment())
        }

        // vai para o detalhe associado a esta posicao
        fun goToDetalhes(fm:FragmentManager, position: Int){
            val bundle = Bundle()
            bundle.putInt("position", position)
            val fragment = DetalhesFragmentListPark()
            fragment.arguments = bundle
            placeFragment(fm, fragment)
        }

        fun goToListCarFragment(fm: FragmentManager){
            placeFragment(fm, ListCarFragment())
        }

        fun goToDetalhesCar(fm: FragmentManager, position: Int?, create : Boolean){
            val bundle = Bundle()
            if (position != null) {
                bundle.putInt("position", position)
            }
            bundle.putBoolean("create", create)
            val fragment = CarDetalhesFragment()
            fragment.arguments = bundle
            placeFragment(fm, fragment)
        }
        fun goToContact(fm: FragmentManager){
            placeFragment(fm, ContactFragment())
        }
        fun goToSettings(fm: FragmentManager){
            placeFragment(fm, SettingsFragment())
        }
    }

}