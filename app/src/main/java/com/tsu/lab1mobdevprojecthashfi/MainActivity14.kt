package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain13Binding
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain14Binding

class MainActivity14 : AppCompatActivity() {
    private lateinit var binding: ActivityMain14Binding //For Main binding Page Number 12

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain14Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button22.setOnClickListener {
            val intent = Intent(this@MainActivity14, MainActivity::class.java)
            startActivity(intent)
        }
    }
}