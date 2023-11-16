package com.example.newsapp.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.data.entity.News
import com.example.newsapp.databinding.FavoriNewsCardBinding
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso


class FavoriPageAdapter(var mContext: Context, var favoriList: List<News>)
    :RecyclerView.Adapter<FavoriPageAdapter.CardTasarimTutucu>() {
    inner  class CardTasarimTutucu(val binding: FavoriNewsCardBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = FavoriNewsCardBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return favoriList.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val news = favoriList.get(position)
        val t = holder.binding

        t.textName.text=news.name
        t.textDescription.text=news.description
        t.textMinute.text=news.category

        t.favoriCardSatir.setOnClickListener {
            // Carda tıklanıldıgı anda News Detail sayfasına gitmeli
        }

        t.iconDelete.setOnClickListener {
            Snackbar.make(it,"${news.name} Do you want to delete this news?", Snackbar.LENGTH_SHORT)
                .setAction("Yes"){
                    delete(news.id)
                }
                .show()

        }
        Picasso.get()
            .load(news.url)
            .resize(150,150)
            .into(t.imageNews)

    }

    fun delete(id:String){
        Log.e("Deleted News",id)
    }


}