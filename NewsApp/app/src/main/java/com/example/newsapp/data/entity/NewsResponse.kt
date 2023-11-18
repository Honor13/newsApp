package com.example.newsapp.data.entity


import com.google.gson.annotations.Expose

data class NewsResponse(
    @Expose
    val articles: List<Article>,
    @Expose
    val status: String?=null,
    @Expose
    val totalResults: Int?=0
)