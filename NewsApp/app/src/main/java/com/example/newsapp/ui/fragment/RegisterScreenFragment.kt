package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentRegisterScreenBinding


class RegisterScreenFragment : Fragment() {

    private lateinit var binding: FragmentRegisterScreenBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentRegisterScreenBinding.inflate(inflater, container, false)

        binding.buttonSignUp.setOnClickListener {
            // button işlemleri buraya
        }
        binding.textCreateSignIn.setOnClickListener {
            // sign In tıklanınca login sayfasına gitsin
        }




        return binding.root
    }

   
}