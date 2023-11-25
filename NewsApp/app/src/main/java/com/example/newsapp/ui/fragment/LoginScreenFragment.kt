package com.example.newsapp.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentLoginScreenBinding
import com.google.firebase.auth.FirebaseAuth


class LoginScreenFragment : Fragment() {

    private lateinit var binding : FragmentLoginScreenBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_login_screen,container,false)
        binding.objectLoginFragment = this

        firebaseAuth = FirebaseAuth.getInstance()
        binding.buttonLogin.setOnClickListener {
            val email = binding.editEmail.text.toString()
            val password = binding.editPassword.text.toString()

            if(email.isNotEmpty() && password.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
                    if (it.isSuccessful){
                        Navigation.findNavController(requireView()).navigate(R.id.transationBottomNavHolder)
                    }else{
                        Toast.makeText(requireContext(),it.exception.toString(),Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(requireContext(),"Fields can not be empty ",Toast.LENGTH_SHORT).show()
            }
        }
        binding.textRegister.setOnClickListener {
            val registerIntent = Intent(requireContext(),RegisterScreenFragment::class.java)
            startActivity(registerIntent)
        }

        binding.textForgotPaswword.setOnClickListener {
            val forgotIntent = Intent(requireContext(),ForgotPasswordScreenFragment::class.java)
            startActivity(forgotIntent)
        }

        return binding.root
    }

 /*   fun loginOK(it:View){
        Navigation.findNavController(it).navigate(R.id.transationBottomNavHolder)

    }*/


}