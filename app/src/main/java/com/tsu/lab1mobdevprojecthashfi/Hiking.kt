package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.HikingBinding

class Hiking : AppCompatActivity() {
     lateinit var binding: HikingBinding //For Hiking page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HikingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button10.setOnClickListener {
            val intent = Intent(this@Hiking, WatchFilm::class.java)
            startActivity(intent)
        }

        binding.button11.setOnClickListener {
            val intent = Intent(this@Hiking, CelebrateHalloween::class.java)
            startActivity(intent)
        }
    }
}