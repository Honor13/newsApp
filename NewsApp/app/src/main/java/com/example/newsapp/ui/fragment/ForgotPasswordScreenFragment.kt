package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentForgotPasswordScreenBinding
import com.example.newsapp.ui.viewmodel.ForgotPasswordViewModel

class ForgotPasswordScreenFragment : Fragment() {
    private lateinit var binding: FragmentForgotPasswordScreenBinding

    private lateinit var viewModel: ForgotPasswordViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentForgotPasswordScreenBinding.inflate(inflater, container, false)
        binding.forgotPassword=this


        binding.textForgotPassword.setOnClickListener {
            // Sign In Textıne tıklanınca Login sayfasına yönlendirsin
        }

        binding.buttonSubmit.setOnClickListener {
            // button İşlemleri buraya
        }


        return binding.root
    }


}