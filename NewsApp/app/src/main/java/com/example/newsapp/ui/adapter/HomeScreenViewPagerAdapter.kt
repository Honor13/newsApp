package com.example.newsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.data.entity.News
import com.example.newsapp.databinding.ViewPagerScreenBinding
import com.squareup.picasso.Picasso

class HomeScreenViewPagerAdapter(var newsList:List<News>) : RecyclerView.Adapter<HomeScreenViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(var binding:ViewPagerScreenBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val binding : ViewPagerScreenBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.view_pager_screen,parent,false)

        return ViewPagerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val news = newsList.get(position)
        val b = holder.binding
        Picasso.get()
            .load(news.url)
            .resize(900,600)
            .into(b.imageViewNews)
//        Glide.with(b.root.context).load(news.viewPageImage).override(700,750).into(b.imageViewNews)
        b.textDescription.text = news.description
        b.textTitle.text = news.name
        b.progressBar.visibility = View.INVISIBLE
    }


}