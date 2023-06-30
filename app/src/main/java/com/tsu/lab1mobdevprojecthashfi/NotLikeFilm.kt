package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.FilmNotlikeBinding

class NotLikeFilm : AppCompatActivity() {
    private lateinit var binding: FilmNotlikeBinding //For Film Not Like page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FilmNotlikeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button17.setOnClickListener {
            val intent = Intent(this@NotLikeFilm, RepeatGamePage::class.java)
            startActivity(intent)
        }
    }
}