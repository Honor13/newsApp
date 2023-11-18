package com.example.newsapp.data.entity


import com.google.gson.annotations.Expose

data class Source(
    @Expose
    val id: String,
    @Expose
    val name: String
)