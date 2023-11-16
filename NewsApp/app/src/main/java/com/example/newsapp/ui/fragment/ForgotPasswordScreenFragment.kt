package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentForgotPasswordScreenBinding

class ForgotPasswordScreenFragment : Fragment() {
    private lateinit var binding: FragmentForgotPasswordScreenBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentForgotPasswordScreenBinding.inflate(inflater, container, false)

        binding.textForgotPassword.setOnClickListener {
            // Sign In Textıne tıklanınca Login sayfasına yönlendirsin
        }

        binding.buttonSubmit.setOnClickListener {
            // button İşlemleri buraya
        }


        return binding.root
    }


}