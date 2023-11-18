package com.example.newsapp.data.entity


import com.google.gson.annotations.Expose

data class NewsResponse(
    @Expose
    val articles: List<Article>,
    @Expose
    val status: String,
    @Expose
    val totalResults: Int
)