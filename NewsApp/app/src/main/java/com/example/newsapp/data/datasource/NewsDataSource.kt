package com.example.newsapp.data.datasource

import com.example.newsapp.data.entity.Article
import com.example.newsapp.retrofit.NewsHeadLineDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NewsDataSource(var nDaoInterface : NewsHeadLineDao) {


    suspend fun loadNewsList() : List<Article> =
        withContext(Dispatchers.IO){
            return@withContext nDaoInterface.getHeadLine().articles
        }



}