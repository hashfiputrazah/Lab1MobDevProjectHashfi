package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain6Binding
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    private lateinit var binding: ActivityMain7Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button12.setOnClickListener {
            val intent = Intent(this@MainActivity7, MainActivity9::class.java)
            startActivity(intent)
        }

        binding.button13.setOnClickListener {
            val intent = Intent(this@MainActivity7, MainActivity10::class.java)
            startActivity(intent)
        }
    }
}