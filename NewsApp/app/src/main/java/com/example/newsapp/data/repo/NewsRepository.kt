package com.example.newsapp.data.repo

import com.example.newsapp.data.datasource.NewsDataSource
import com.example.newsapp.data.entity.Article

class NewsRepository(var nDso : NewsDataSource) {

    suspend fun loadNewsList() : List<Article> = nDso.loadNewsList()
    fun addFavorite(userId: String, author: String,content: String, description: String,publishedAt: String,title: String,url: String,urlToImage: String) =
        nDso.addFavorite(userId,author,content,description, publishedAt, title, url, urlToImage)








}