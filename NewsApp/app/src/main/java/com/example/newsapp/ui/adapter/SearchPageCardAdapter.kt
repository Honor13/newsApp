package com.example.newsapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.data.entity.Article
import com.example.newsapp.databinding.NewsCardDesignBinding
import com.squareup.picasso.Picasso

class SearchPageCardAdapter (var mContext: Context, var newsList:List<Article>)
    : RecyclerView.Adapter<SearchPageCardAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu( val binding:NewsCardDesignBinding ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {

        val binding = NewsCardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val news = newsList.get(position)
        val t = holder.binding

        t.textHead.text=news.title
        t.textDescription.text=news.description
        t.textMinute.text=news.urlToImage

        t.cardViewSatir.setOnClickListener {
            // carda basılınca newsDetail sayfasına gitmeli
        }

        Picasso.get()
            .load(news.urlToImage)
            .resize(150,150)
            .into(t.imageView)
        
    }

    override fun getItemCount(): Int {
        return newsList.size
    }


}