package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain12Binding
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain13Binding

class MainActivity13 : AppCompatActivity() {
    private lateinit var binding: ActivityMain13Binding //For Main binding Page Number 13

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain13Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button21.setOnClickListener {
            val intent = Intent(this@MainActivity13, MainActivity14::class.java)
            startActivity(intent)
        }
    }
}