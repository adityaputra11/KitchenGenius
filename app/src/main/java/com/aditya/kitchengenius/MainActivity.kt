package com.aditya.kitchengenius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomMenuNav)
//        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.menu_home -> {
//                    // Handle home menu item click
//                    true
//                }
//                R.id.menu_search -> {
//                    // Handle search menu item click
//                    true
//                }
//                R.id.menu_profile -> {
//                    // Handle profile menu item click
//                    true
//                }
//                else -> false
//            }
//        }
    }
}