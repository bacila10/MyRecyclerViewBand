package com.bandymas.myrecyclerviewband.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bandymas.myrecyclerviewband.Model.DummyData
import com.bandymas.myrecyclerviewband.R

class NewsAdapter(private val dummyList: List<DummyData>): RecyclerView.Adapter<NewsAdapter.NewsHolder>() {



    class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.items_dummy_data, parent, false)
        return NewsHolder(view)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}