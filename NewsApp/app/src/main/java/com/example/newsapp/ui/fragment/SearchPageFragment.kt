package com.example.newsapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.data.entity.News
import com.example.newsapp.databinding.FragmentSearchPageBinding
import com.example.newsapp.ui.adapter.SearchPageCardAdapter

class SearchPageFragment : Fragment() {
    private lateinit var binding: FragmentSearchPageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchPageBinding.inflate(inflater, container, false)

        binding.rv.layoutManager = LinearLayoutManager(requireContext())


        // manuel birkaç veri

        val newsList = ArrayList<News>()
        val n1 = News(
            "abc-news",
            "ABC News",
            "Your trusted source for breaking news, analysis, exclusive interviews, headlines, and videos at ABCNews.com.",
            " https://abcnews.go.com",
            "general",
            "en",
            "us"
        )
        newsList.add(n1)

        val searchPageCardAdapter = SearchPageCardAdapter(requireContext(), newsList)
        binding.rv.adapter = searchPageCardAdapter


        // search fonc
        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    search(query)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    search(newText)
                }
                return true
            }

        })

        return binding.root
    }

    fun search(searchWord: String) {
        Log.e("Search News ", searchWord)
    }

}
