package com.bandymas.myrecyclerviewband.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bandymas.myrecyclerviewband.AddItems
import com.bandymas.myrecyclerviewband.Model.DummyData
import com.bandymas.myrecyclerviewband.R
import com.bandymas.myrecyclerviewband.databinding.ItemsDummyDataBinding

class NewsAdapter(private val dummyList: List<DummyData>): RecyclerView.Adapter<NewsAdapter.NewsHolder>() {

  //  private lateinit var binding: ItemsDummyDataBinding
  //val largeDummyList = AddItems.getDummyData(this)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
       val binding = LayoutInflater.from(parent.context).inflate(R.layout.items_dummy_data, parent, false)
        return NewsHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        val item = dummyList[position]
        holder.itemTextView.text = item.title
        holder.itemImageView.setImageDrawable(item.image)
    }

    override fun getItemCount(): Int = dummyList.size

    class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemTextView = itemView.findViewById<TextView>(R.id.txtDummy)
        var itemImageView = itemView.findViewById<ImageView>(R.id.imgDummy)
    }
}