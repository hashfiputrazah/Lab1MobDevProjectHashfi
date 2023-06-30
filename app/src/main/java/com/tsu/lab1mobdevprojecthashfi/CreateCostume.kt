package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.CostumeCreateBinding

class CreateCostume : AppCompatActivity() {
    private lateinit var binding: CostumeCreateBinding //For Costume Create page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CostumeCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button18.setOnClickListener {
            val intent = Intent(this@CreateCostume, BeautifulCostume::class.java)
            startActivity(intent)
        }

        binding.button19.setOnClickListener {
            val intent = Intent(this@CreateCostume, UglyCostume::class.java)
            startActivity(intent)
        }
    }
}