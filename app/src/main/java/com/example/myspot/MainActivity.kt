package com.example.myspot

import android.icu.lang.UCharacter.BidiPairedBracketType.OPEN
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NavigationManager.goToListParksFragment(supportFragmentManager)
        setSupportActionBar(toolbar)
        setupDrawerMenu()
        if(!screenRotated(savedInstanceState)){
            NavigationManager.goToListParksFragment(supportFragmentManager)
        }
        //supportFragmentManager.beginTransaction().replace(R.id.frame, ListParksFragment()).commit()
    }

    private fun screenRotated(savedInstanceState: Bundle?):Boolean{
        return savedInstanceState != null
    }

    private fun setupDrawerMenu(){
        val toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.drawer_open, R.string.drawer_close)
        nav_drawer.setNavigationItemSelectedListener(this)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        /*when(item.itemId){
            R.id.nav_home -> NavigationManager.goToListParksFragment(supportFragmentManager)
        }*/

        when (item.itemId) {
            R.id.nav_home ->
            {
                NavigationManager.goToListParksFragment(supportFragmentManager)
                //Toast.makeText(this, "Lista Parks", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_my_cars ->
            {
                NavigationManager.goToListCarFragment(supportFragmentManager)
                //Toast.makeText(this, "Lista Cars", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_contact->
            {
                NavigationManager.goToContact(supportFragmentManager)
                //Toast.makeText(this, "Contacts", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_settings ->
            {
                NavigationManager.goToSettings(supportFragmentManager)
            }
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START))
            drawer.closeDrawer(GravityCompat.START)
        else if(supportFragmentManager.backStackEntryCount == 1) finish()
        else super.onBackPressed()
    }
}