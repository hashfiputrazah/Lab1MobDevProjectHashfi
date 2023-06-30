package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.PageHomeBinding


class HomePage : AppCompatActivity() {
    lateinit var binding: PageHomeBinding //For Home Page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PageHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button.setOnClickListener {
            val intent = Intent(this@HomePage, InputName::class.java)
            startActivity(intent)
        }
    }
}