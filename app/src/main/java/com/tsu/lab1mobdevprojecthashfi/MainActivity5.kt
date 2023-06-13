package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain4Binding
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMain5Binding //For Main binding Page Number 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button8.setOnClickListener {
            val intent = Intent(this@MainActivity5, MainActivity7::class.java)
            startActivity(intent)
        }

        binding.button9.setOnClickListener {
            val intent = Intent(this@MainActivity5, MainActivity8::class.java)
            startActivity(intent)
        }
    }
}