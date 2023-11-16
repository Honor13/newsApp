package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.newsapp.databinding.ActivityMainBinding
import com.example.newsapp.ui.fragment.FavoritesPageFragment
import com.example.newsapp.ui.fragment.HomePageFragment
import com.example.newsapp.ui.fragment.ProfilePageFragment
import com.example.newsapp.ui.fragment.SearchPageFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)


//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainNavHostFragment) as NavHostFragment
//        val navController = navHostFragment.navController
//        navController.navigate(R.id.loginScreenFragment)
    }
}