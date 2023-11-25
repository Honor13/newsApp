package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentFavoritesPageBinding


class FavoritesPageFragment : Fragment() {
    private lateinit var binding: FragmentFavoritesPageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_favorites_page, container, false)
        binding.favoritesFragment=this


        binding.rv.layoutManager=LinearLayoutManager(requireContext())

// Burada Room database den veriler çekilecek tabi bunun için begenilen haberler database e eklenmeli


//        val favoriList = ArrayList<Article>()
//        val favoriPageAdapter = FavoriPageAdapter(requireContext(),favoriList)
//        binding.rv.adapter=favoriPageAdapter

        binding.imageBackMain.setOnClickListener {
            // Favori sayfasından Home sayfasına geçiş kodu yazılacak buraya
        }

        return binding.root
    }


}