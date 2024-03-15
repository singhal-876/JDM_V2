package com.abhinav.jdm_v2

import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var coordinatorLayout: CoordinatorLayout
    private lateinit var frameLayout: FrameLayout
    private lateinit var toolbar: Toolbar
    private lateinit var navigationLayout: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer)
        coordinatorLayout = findViewById(R.id.coordinator)
        frameLayout = findViewById(R.id.frame)
        toolbar = findViewById(R.id.toolbar)
        navigationLayout = findViewById(R.id.navigation)

        setUpToolbar()

        val actionBarDrawerLayout =
            ActionBarDrawerToggle(this@MainActivity, drawerLayout, R.string.open, R.string.close)

        drawerLayout.addDrawerListener(actionBarDrawerLayout)
        actionBarDrawerLayout.syncState()

        navigationLayout.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.dashboard -> {
                    Toast.makeText(this@MainActivity, "Dashboard", Toast.LENGTH_SHORT).show()
                }
                R.id.favourites -> {
                    Toast.makeText(this@MainActivity, "Favourites", Toast.LENGTH_SHORT).show()
                }
                R.id.profile -> {
                    Toast.makeText(this@MainActivity, "Profile", Toast.LENGTH_SHORT).show()
                }
                R.id.about_us -> {
                    Toast.makeText(this@MainActivity, "About Us", Toast.LENGTH_SHORT).show()
                }
            }
            return@setNavigationItemSelectedListener true
        }

    }

    private fun setUpToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = "JDM V2"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id=item.itemId
        if(id == android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START)
        }

        return super.onOptionsItemSelected(item)
    }

}