package com.example.newsapp.data.entity


import com.google.gson.annotations.Expose

data class Source(
    @Expose
    val id: String?=null,
    @Expose
    val name: String?=null
)