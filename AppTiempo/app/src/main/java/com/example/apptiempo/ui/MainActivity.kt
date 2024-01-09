package com.example.apptiempo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apptiempo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}