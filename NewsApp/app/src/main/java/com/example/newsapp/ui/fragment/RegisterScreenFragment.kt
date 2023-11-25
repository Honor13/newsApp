package com.example.newsapp.ui.fragment

import android.content.Intent
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
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class RegisterScreenFragment : Fragment() {

    private lateinit var binding: FragmentRegisterScreenBinding
    private lateinit var viewModel: RegisterScreenViewModel
    private lateinit var firebaseAuth :FirebaseAuth
    private lateinit var globalIterator : View



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_register_screen,container, false)
        binding.registerFragment= this

        globalIterator = binding.buttonSignUp
        firebaseAuth = FirebaseAuth.getInstance()

        binding.buttonSignUp.setOnClickListener {
            val username = binding.editCreateUsername.text.toString()
            val email = binding.editCreateEmail.text.toString()
            val password = binding.editCreatePassword.text.toString()
            val rePassword = binding.editCreateRepassword.text.toString()

            buttonRegister(username, email, password, rePassword) // for controle

            if(username.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && rePassword.isNotEmpty()){
               if (password == rePassword){

                   firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                       if(it.isSuccessful){
                           Navigation.findNavController(globalIterator).navigate(R.id.transactionLoginScreenFragment)
                       }else{
                           Toast.makeText(requireContext(),it.exception.toString(),Toast.LENGTH_SHORT).show()
                       }
                   }
               }else{
                   Toast.makeText(requireContext(),"Password does not matched",Toast.LENGTH_SHORT).show()
               }
            }else{
                Toast.makeText(requireContext(),"Fields cannot be empty",Toast.LENGTH_SHORT).show()
            }
        }
        binding.textCreateSignIn.setOnClickListener {

            val loginIntent = Intent(requireContext(),LoginScreenFragment::class.java)
            startActivity(loginIntent)
        }
        return binding.root
    }

    fun buttonRegister(username:String,email:String,password:String,rePassword:String){
        Log.e("Register","$username-$email-$password-$rePassword")
    }




   
}