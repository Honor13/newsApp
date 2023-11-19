package com.example.newsapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentSearchPageBinding
import com.example.newsapp.ui.viewmodel.SearchPageViewModel

class SearchPageFragment : Fragment() {
    private lateinit var binding: FragmentSearchPageBinding
    private lateinit var viewModel: SearchPageViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search_page, container, false)
        binding.searchFragment = this
        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        binding.lifecycleOwner = viewLifecycleOwner


//        // manuel birkaç veri
//
//        val newsList = ArrayList<News>()
//        val n1 = News(
//            "abc-news",
//            "ABC News",
//            "Your trusted source for breaking news, analysis, exclusive interviews, headlines, and videos at ABCNews.com.",
//            "https://www.marketscreener.com/images/reuters/2019-02/2019-02-04T141305Z_1_LYNXNPEF1314N_RTROPTP_3_TESLA-LAYOFFSS.JPG",
//            "general",
//            "en",
//            "us"
//        )
//        newsList.add(n1)
//
//        val searchPageCardAdapter = SearchPageCardAdapter(requireContext(), newsList)
//        binding.rv.adapter = searchPageCardAdapter


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

    // viewModel bağlama işlemi


    fun search(searchWord: String) {
        Log.e("Search News ", searchWord)
    }

}
