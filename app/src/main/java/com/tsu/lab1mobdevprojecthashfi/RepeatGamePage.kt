package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.PageRepeatgameBinding

class RepeatGamePage : AppCompatActivity() {
    private lateinit var binding: PageRepeatgameBinding //For Repeat Game Page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PageRepeatgameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button22.setOnClickListener {
            val intent = Intent(this@RepeatGamePage, HomePage::class.java)
            startActivity(intent)
        }
    }
}