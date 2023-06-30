package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain9Binding

class MainActivity9 : AppCompatActivity() {
    private lateinit var binding: ActivityMain9Binding //For Main binding Page Number 9

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain9Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button16.setOnClickListener {
            val intent = Intent(this@MainActivity9, MainActivity14::class.java)
            startActivity(intent)
        }
    }
}