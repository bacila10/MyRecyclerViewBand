package com.bandymas.myrecyclerviewband

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bandymas.myrecyclerviewband.Model.DummyData
import com.bandymas.myrecyclerviewband.adapter.NewsAdapter
import com.bandymas.myrecyclerviewband.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

      //  binding.rvNews.adapter =

        val recyclerViewNews = binding.rvNews
        val largeDummyList = AddItems.getDummyData(this)
        val newsAdapter = NewsAdapter(largeDummyList)
        val layoutManeger = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewNews.adapter = newsAdapter
        recyclerViewNews.layoutManager = layoutManeger
        recyclerViewNews.setHasFixedSize(true)
        recyclerViewNews.addItemDecoration(
              DividerItemDecoration(
                  this,
                  layoutManeger.orientation
              )
          )
    }
}