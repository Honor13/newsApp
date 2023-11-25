package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentNewsDetailScreenBinding
import com.example.newsapp.ui.viewmodel.NewsDetailScreenViewModel
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsDetailScreenFragment : Fragment() {


    private lateinit var binding : FragmentNewsDetailScreenBinding
    private lateinit var viewModel: NewsDetailScreenViewModel
    private lateinit var firebaseAuth : FirebaseAuth
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_news_detail_screen, container, false)

        binding.objectDetailScreenFragment = this
        firebaseAuth = FirebaseAuth.getInstance()
        val bundle : NewsDetailScreenFragmentArgs by navArgs()
        val news = bundle.newsArticle

        binding.objectNews = news

        Picasso.get()
            .load(news.urlToImage)
            .resize(600,100)
            .into(binding.imageView)


        binding.imgToolbarBtnFav.setOnClickListener{
            addFavorites(firebaseAuth.uid.toString(),news.author.toString(),news.content.toString(),news.description.toString(),news.publishedAt.toString(),news.title.toString(),news.url.toString(),news.urlToImage)
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : NewsDetailScreenViewModel by viewModels()
        viewModel = tempViewModel
    }


    fun addFavorites(
        userId: String, author: String,
        content: String, description: String,
        publishedAt: String,
        title: String,
        url: String,
        urlToImage: String?
    ){
        viewModel.addFavorite(userId, author, content, description, publishedAt, title, url, urlToImage!!)
        Toast.makeText(requireContext(),"News Added Favorites",Toast.LENGTH_SHORT).show()
    }

}