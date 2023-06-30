package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.FilmWatchBinding

class WatchFilm : AppCompatActivity() {
    private lateinit var binding: FilmWatchBinding //For Film Watch page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FilmWatchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button12.setOnClickListener {
            val intent = Intent(this@WatchFilm, LikeFilm::class.java)
            startActivity(intent)
        }

        binding.button13.setOnClickListener {
            val intent = Intent(this@WatchFilm, NotLikeFilm::class.java)
            startActivity(intent)
        }
    }
}