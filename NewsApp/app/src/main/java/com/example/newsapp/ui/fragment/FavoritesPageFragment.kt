package com.example.newsapp.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.R
import com.example.newsapp.data.entity.News
import com.example.newsapp.databinding.FragmentFavoritesPageBinding
import com.example.newsapp.ui.adapter.FavoriPageAdapter


class FavoritesPageFragment : Fragment() {
    private lateinit var binding: FragmentFavoritesPageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFavoritesPageBinding.inflate(inflater, container, false)


        binding.rv.layoutManager=LinearLayoutManager(requireContext())
        val favoriList = ArrayList<News>()
        val n1 = News(
            "abc-news",
            "ABC News",
            "Your trusted source for breaking news, analysis, exclusive interviews, headlines, and videos at ABCNews.com.",
            " https://abcnews.go.com",
            "general",
            "en",
            "us"
        )
        favoriList.add(n1)

        val favoriPageAdapter = FavoriPageAdapter(requireContext(),favoriList)
        binding.rv.adapter=favoriPageAdapter


        binding.imageBackMain.setOnClickListener {
            // Favori sayfasından Home sayfasına geçiş kodu yazılacak buraya
        }

        return binding.root
    }


}