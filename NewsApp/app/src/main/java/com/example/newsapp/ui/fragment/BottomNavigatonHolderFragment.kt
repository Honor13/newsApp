package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentBottomNavigatonHolderBinding


class BottomNavigatonHolderFragment : Fragment() {


    private lateinit var binding:FragmentBottomNavigatonHolderBinding
    private lateinit var fragmentManager : FragmentManager
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_bottom_navigaton_holder,container,false)

        binding.bottomNavBar.setOnItemSelectedListener {item ->

            when(item.itemId){
                R.id.action_home -> openFragment(HomePageFragment())
                R.id.action_search -> openFragment(SearchPageFragment())
                R.id.action_categories -> openFragment(FavoritesPageFragment())
                R.id.action_favorites -> openFragment(FavoritesPageFragment())
                R.id.action_profile -> openFragment(ProfilePageFragment())


            }
            true
        }
        openFragment(HomePageFragment())


        return binding.root
    }

    private fun openFragment(fragment:Fragment){
        val fragmentTransaction : FragmentTransaction = childFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.navHostFragment,fragment)
        fragmentTransaction.commit()
    }



}