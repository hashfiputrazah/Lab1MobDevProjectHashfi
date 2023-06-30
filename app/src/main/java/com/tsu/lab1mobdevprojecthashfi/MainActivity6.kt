package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
     lateinit var binding: ActivityMain6Binding //For Main binding Page Number 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button10.setOnClickListener {
            val intent = Intent(this@MainActivity6, MainActivity7::class.java)
            startActivity(intent)
        }

        binding.button11.setOnClickListener {
            val intent = Intent(this@MainActivity6, MainActivity8::class.java)
            startActivity(intent)
        }
    }
}