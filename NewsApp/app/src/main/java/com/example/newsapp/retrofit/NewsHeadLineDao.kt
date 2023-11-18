package com.example.newsapp.retrofit

import com.example.newsapp.data.entity.NewsResponse
import com.example.newsapp.util.Constants.Companion.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsHeadLineDao {


    @GET("top-headlines")
    suspend fun getHeadLine(
        @Query("country") countryValue : String = "us",
        @Query("apiKey") apiKey : String = API_KEY):NewsResponse
}