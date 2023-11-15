package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentLoginScreenBinding


class LoginScreenFragment : Fragment() {

    private lateinit var binding : FragmentLoginScreenBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_login_screen,container,false)

        binding.objectLoginFragment = this

        return binding.root
    }

    fun loginOK(it:View){
        Navigation.findNavController(it).navigate(R.id.transationBottomNavHolder)

    }


}