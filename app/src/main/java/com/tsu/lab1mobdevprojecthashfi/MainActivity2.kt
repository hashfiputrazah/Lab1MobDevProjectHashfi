package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding //For Main binding Page Number 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button2.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            intent.putExtra(MainActivity3.NAME, binding.editTextTextPersonName3.text.toString())
            startActivity(intent)
        }
    }
}