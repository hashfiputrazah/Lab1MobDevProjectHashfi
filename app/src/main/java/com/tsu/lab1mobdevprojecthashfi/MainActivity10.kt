package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain10Binding
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain9Binding

class MainActivity10 : AppCompatActivity() {
    private lateinit var binding: ActivityMain10Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button17.setOnClickListener {
            val intent = Intent(this@MainActivity10, MainActivity14::class.java)
            startActivity(intent)
        }
    }
}