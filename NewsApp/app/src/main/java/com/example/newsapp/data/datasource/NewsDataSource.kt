package com.example.newsapp.data.datasource

import com.example.newsapp.data.entity.Article
import com.example.newsapp.data.entity.Favorites
import com.example.newsapp.retrofit.NewsHeadLineDao
import com.google.firebase.firestore.CollectionReference
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NewsDataSource(var nDaoInterface : NewsHeadLineDao, var collectionFavorites: CollectionReference) {


    suspend fun loadNewsList() : List<Article> =
        withContext(Dispatchers.IO){
            return@withContext nDaoInterface.getHeadLine().articles
        }

    fun addFavorite(userId: String, author: String,content: String, description: String,publishedAt: String,title: String,url: String,urlToImage: String){
        val newFavorite = Favorites("",userId,author,content,description,publishedAt,title,url,urlToImage)
        collectionFavorites.document().set(newFavorite)
    }



}