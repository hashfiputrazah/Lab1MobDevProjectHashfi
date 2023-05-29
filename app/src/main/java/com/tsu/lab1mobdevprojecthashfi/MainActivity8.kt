package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain7Binding
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain8Binding

class MainActivity8 : AppCompatActivity() { //For Main binding Page Number 8
    private lateinit var binding: ActivityMain8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button14.setOnClickListener {
            val intent = Intent(this@MainActivity8, MainActivity7::class.java)
            startActivity(intent)
        }

        binding.button15.setOnClickListener {
            val intent = Intent(this@MainActivity8, MainActivity11::class.java)
            startActivity(intent)
        }

    }
}