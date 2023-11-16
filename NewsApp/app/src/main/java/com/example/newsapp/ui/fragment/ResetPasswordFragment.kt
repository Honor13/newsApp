package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentResetPasswordBinding


class ResetPasswordFragment : Fragment() {

    private lateinit var binding: FragmentResetPasswordBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding=FragmentResetPasswordBinding.inflate(inflater, container, false)

        binding.imageBackProfile.setOnClickListener {
            // ResetPasswordFragmentten Profi sayfasına giricek
        }

        binding.buttonReset.setOnClickListener {
            // Button ile resetleeme kodları buraya
        }






        return binding.root
    }


}