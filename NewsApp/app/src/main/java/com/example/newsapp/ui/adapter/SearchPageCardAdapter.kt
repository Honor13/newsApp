package com.example.newsapp.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.data.entity.News
import com.example.newsapp.databinding.NewsCardDesignBinding
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso

class SearchPageCardAdapter (var mContext: Context, var newsList:List<News>)
    : RecyclerView.Adapter<SearchPageCardAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu( val binding:NewsCardDesignBinding ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {

        val binding = NewsCardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val news = newsList.get(position)
        val t = holder.binding

        t.textName.text=news.name
        t.textDescription.text=news.description
        t.textMinute.text=news.category

        t.cardViewSatir.setOnClickListener {
            // carda basılınca newsDetail sayfasına gitmeli
        }

        Picasso.get()
            .load(news.url)
            .resize(150,150)
            .into(t.imageView)
        
    }

    override fun getItemCount(): Int {
        return newsList.size
    }


}