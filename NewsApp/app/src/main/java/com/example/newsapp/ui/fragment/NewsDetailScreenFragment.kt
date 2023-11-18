package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentNewsDetailScreenBinding
import com.squareup.picasso.Picasso

class NewsDetailScreenFragment : Fragment() {


    private lateinit var binding : FragmentNewsDetailScreenBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_news_detail_screen, container, false)

        binding.objectDetailScreenFragment = this

        val bundle : NewsDetailScreenFragmentArgs by navArgs()
        val news = bundle.newsArticle

        binding.objectNews = news

        Picasso.get()
            .load(news.urlToImage)
            .resize(600,100)
            .into(binding.imageView)



        return binding.root
    }

}