package com.example.newsapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentRegisterScreenBinding
import com.example.newsapp.ui.viewmodel.RegisterScreenViewModel


class RegisterScreenFragment : Fragment() {

    private lateinit var binding: FragmentRegisterScreenBinding
    private lateinit var viewModel: RegisterScreenViewModel



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_register_screen,container, false)

        binding.registerFragment= this

      


        binding.textCreateSignIn.setOnClickListener {

        }






        return binding.root
    }

    fun buttonRegister(username:String,email:String,password:String,rePassword:String){
        Log.e("Register","$username-$email-$password-$rePassword")
    }




   
}