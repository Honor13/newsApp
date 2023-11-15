package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.data.entity.News
import com.example.newsapp.databinding.FragmentSearchPageBinding

class SearchPageFragment : Fragment() {
    private lateinit var binding: FragmentSearchPageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentSearchPageBinding.inflate(inflater, container, false)

        binding.rv.layoutManager=LinearLayoutManager(requireContext())

        // manuel birkaç veri


        val newsList = ArrayList<News>()
        val n1 = News("abc-news","ABC News","Your trusted source for breaking news, analysis, exclusive interviews, headlines, and videos at ABCNews.com."," https://abcnews.go.com","general","en","us")






        return binding.root
    }


}