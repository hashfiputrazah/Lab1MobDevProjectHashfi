package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.CampingBinding

class Camping : AppCompatActivity() {
    lateinit var binding: CampingBinding //For Camping page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CampingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button8.setOnClickListener {
            val intent = Intent(this@Camping, WatchFilm::class.java)
            startActivity(intent)
        }

        binding.button9.setOnClickListener {
            val intent = Intent(this@Camping, CelebrateHalloween::class.java)
            startActivity(intent)
        }
    }
}