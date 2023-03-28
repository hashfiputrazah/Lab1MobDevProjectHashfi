package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button3.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity4::class.java)
            startActivity(intent)
        }

        binding.button4.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity5::class.java)
            startActivity(intent)
        }

        binding.button5.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity6::class.java)
            startActivity(intent)
        }
    }
}