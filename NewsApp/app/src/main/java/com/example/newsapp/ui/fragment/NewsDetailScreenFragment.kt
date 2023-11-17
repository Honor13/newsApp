package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentNewsDetailScreenBinding

class NewsDetailScreenFragment : Fragment() {


    private lateinit var binding : FragmentNewsDetailScreenBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_news_detail_screen, container, false)

        return binding.root
    }

}