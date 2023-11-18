package com.example.newsapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapp.data.entity.Article
import com.example.newsapp.data.repo.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomePageViewModel @Inject constructor(var newsRepo : NewsRepository) : ViewModel() {

    var newsLists = MutableLiveData<List<Article>>()

    init {
        loadNewsList()

    }

    fun loadNewsList(){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                newsLists.value = newsRepo.loadNewsList()
            }catch (e:Exception){

            }
        }
    }





}