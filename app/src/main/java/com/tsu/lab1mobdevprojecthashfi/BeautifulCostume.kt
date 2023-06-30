package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.CostumeBeautifulBinding

class BeautifulCostume : AppCompatActivity() {
    private lateinit var binding: CostumeBeautifulBinding //For Costume Beautiful page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CostumeBeautifulBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button20.setOnClickListener {
            val intent = Intent(this@BeautifulCostume, RepeatGamePage::class.java)
            startActivity(intent)
        }
    }
}