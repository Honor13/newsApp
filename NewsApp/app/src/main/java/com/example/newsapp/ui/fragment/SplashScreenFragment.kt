package com.example.newsapp.ui.fragment

import android.animation.Animator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentSplashScreenBinding

class SplashScreenFragment : Fragment() {

    private lateinit var binding : FragmentSplashScreenBinding
    private lateinit var it:View
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_splash_screen, container, false)

        it = binding.lottieAnimationView

        binding.lottieAnimationView.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator) {

            }

            override fun onAnimationEnd(animation: Animator) {
                Navigation.findNavController(it).navigate(R.id.transactionLoginFragment)
            }

            override fun onAnimationCancel(animation: Animator) {

            }

            override fun onAnimationRepeat(animation: Animator) {

            }

        })
        return binding.root
    }



}