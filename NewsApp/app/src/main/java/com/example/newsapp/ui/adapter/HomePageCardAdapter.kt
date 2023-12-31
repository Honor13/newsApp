package com.example.newsapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.data.entity.Article
import com.example.newsapp.databinding.NewsCardDesignBinding
import com.example.newsapp.ui.fragment.BottomNavigatonHolderFragmentDirections
import com.squareup.picasso.Picasso

data class HomePageCardAdapter(var newsList:List<Article>):RecyclerView.Adapter<HomePageCardAdapter.HomePageNewsViewHolder>() {

    inner class HomePageNewsViewHolder(var binding: NewsCardDesignBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomePageNewsViewHolder {
        val binding :NewsCardDesignBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.news_card_design,parent,false)

        return HomePageNewsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return  newsList.size
    }

    override fun onBindViewHolder(holder: HomePageNewsViewHolder, position: Int) {
        val news = newsList.get(position)
        val b = holder.binding

        b.objectNews = news


        b.cardViewSatir.setOnClickListener{
            val transaction = BottomNavigatonHolderFragmentDirections.transactionNewsDetailScreenFragment(news)
            Navigation.findNavController(it).navigate(transaction)
        }
        b.textMinute.text = "1 munite ago"
        Picasso.get()
            .load(news.urlToImage)
            .resize(150,150)
            .into(b.imageView)


    }
}