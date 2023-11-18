package com.example.newsapp.data.entity


import com.google.gson.annotations.Expose
import java.io.Serializable

data class Article(
    @Expose
    val author: String?=null,
    @Expose
    val content: String?=null,
    @Expose
    val description: String?=null,
    @Expose
    val publishedAt: String?=null,
    @Expose
    val source: Source?=null,
    @Expose
    val title: String?=null,
    @Expose
    val url: String?=null,
    @Expose
    val urlToImage: String?=null
):Serializable