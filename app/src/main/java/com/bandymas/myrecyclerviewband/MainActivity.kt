package com.bandymas.myrecyclerviewband

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bandymas.myrecyclerviewband.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}