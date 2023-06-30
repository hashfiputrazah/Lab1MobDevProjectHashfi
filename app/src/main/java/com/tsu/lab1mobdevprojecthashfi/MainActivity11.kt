package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain11Binding

class MainActivity11 : AppCompatActivity() {
    private lateinit var binding: ActivityMain11Binding //For Main binding Page Number 11

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain11Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button18.setOnClickListener {
            val intent = Intent(this@MainActivity11, MainActivity12::class.java)
            startActivity(intent)
        }

        binding.button19.setOnClickListener {
            val intent = Intent(this@MainActivity11, MainActivity13::class.java)
            startActivity(intent)
        }
    }
}