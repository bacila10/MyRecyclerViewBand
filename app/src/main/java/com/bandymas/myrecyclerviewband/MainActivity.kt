package com.bandymas.myrecyclerviewband

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bandymas.myrecyclerviewband.Model.DummyData
import com.bandymas.myrecyclerviewband.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val largeDummyList = AddItems.getDummyData(this)



    }
}