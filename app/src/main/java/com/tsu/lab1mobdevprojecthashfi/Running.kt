package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.RunningBinding

class Running : AppCompatActivity() {
    lateinit var binding: RunningBinding //For Running page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RunningBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button6.setOnClickListener {
            val intent = Intent(this@Running, WatchFilm::class.java)
            startActivity(intent)
        }

        binding.button7.setOnClickListener {
            val intent = Intent(this@Running, CelebrateHalloween::class.java)
            startActivity(intent)
        }
    }
}