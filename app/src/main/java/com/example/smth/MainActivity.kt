package com.example.smth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavigation()

    }
    private fun setupNavigation() {
        val navController = Navigation.findNavController(this, R.id.my_nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration
            .Builder(
                R.id.android_navigation
               )
            .build()
        NavigationUI.setupActionBarWithNavController(this, navController,appBarConfiguration)
        NavigationUI.setupWithNavController(bottom_nav_view, navController)
    }
}