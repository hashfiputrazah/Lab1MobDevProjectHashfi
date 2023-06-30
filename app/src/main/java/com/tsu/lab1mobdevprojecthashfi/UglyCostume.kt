package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.CostumeUglyBinding

class UglyCostume : AppCompatActivity() {
    private lateinit var binding: CostumeUglyBinding //For Costume Ugly page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CostumeUglyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button21.setOnClickListener {
            val intent = Intent(this@UglyCostume, RepeatGamePage::class.java)
            startActivity(intent)
        }
    }
}