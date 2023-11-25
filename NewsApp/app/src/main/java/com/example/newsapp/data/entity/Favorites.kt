package com.example.newsapp.data.entity

import com.google.gson.annotations.Expose

class Favorites(
    val favId: String? = "",
    val userId: String? = "",
    val author: String? = "",
    val content: String? = "",
    val description: String? = "",
    val publishedAt: String? = "",
    val title: String? = "",
    val url: String? = "",
    val urlToImage: String? = ""
) {
}