package com.example.newsapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.newsapp.data.repo.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsDetailScreenViewModel @Inject constructor(var newsRepo : NewsRepository) : ViewModel() {

    fun addFavorite(userId: String, author: String,content: String, description: String,publishedAt: String,title: String,url: String,urlToImage: String){
        newsRepo.addFavorite(userId, author, content, description, publishedAt, title, url, urlToImage)
    }
}