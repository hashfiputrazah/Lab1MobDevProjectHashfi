package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.FilmLikeBinding

class LikeFilm : AppCompatActivity() {
    private lateinit var binding: FilmLikeBinding //For Film Like page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FilmLikeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button16.setOnClickListener {
            val intent = Intent(this@LikeFilm, RepeatGamePage::class.java)
            startActivity(intent)
        }
    }
}