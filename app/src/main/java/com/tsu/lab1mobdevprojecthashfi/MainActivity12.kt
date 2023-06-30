package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain12Binding

class MainActivity12 : AppCompatActivity() {
    private lateinit var binding: ActivityMain12Binding //For Main binding Page Number 12

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button20.setOnClickListener {
            val intent = Intent(this@MainActivity12, MainActivity14::class.java)
            startActivity(intent)
        }
    }
}