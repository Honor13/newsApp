package com.example.newsapp.data.repo

import com.example.newsapp.data.datasource.NewsDataSource
import com.example.newsapp.data.entity.Article

class NewsRepository(var nDao : NewsDataSource) {

    suspend fun loadNewsList() : List<Article> = nDao.loadNewsList()







}