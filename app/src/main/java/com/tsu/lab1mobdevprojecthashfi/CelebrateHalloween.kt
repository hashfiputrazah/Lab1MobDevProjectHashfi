package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.HalloweenCelebrateBinding

class CelebrateHalloween : AppCompatActivity() {
    private lateinit var binding: HalloweenCelebrateBinding //For Halloween Celebrate page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HalloweenCelebrateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button14.setOnClickListener {
            val intent = Intent(this@CelebrateHalloween, WatchFilm::class.java)
            startActivity(intent)
        }

        binding.button15.setOnClickListener {
            val intent = Intent(this@CelebrateHalloween, CreateCostume::class.java)
            startActivity(intent)
        }

    }
}