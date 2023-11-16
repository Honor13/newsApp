package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentProfilePageBinding


class ProfilePageFragment : Fragment() {

    private lateinit var binding:FragmentProfilePageBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_profile_page, container, false)

        binding.objectProfilePageFragment = this

        return binding.root
    }


    fun transactionGetInTouch(it:View){

        Navigation.findNavController(it).navigate(R.id.transactionGetInTouch)

    }


}