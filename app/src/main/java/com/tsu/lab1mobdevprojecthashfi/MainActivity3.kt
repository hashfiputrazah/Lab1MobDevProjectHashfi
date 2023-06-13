package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding //For Main binding Page Number 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val name = intent.getStringExtra(NAME)
        binding.textView3.text = getString(R.string.great_text, name)

        binding.button3.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity4::class.java)
            startActivity(intent)
        }

        binding.button4.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity5::class.java)
            startActivity(intent)
        }

        binding.button5.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity6::class.java)
            startActivity(intent)
        }
    }

    companion object {
        const val NAME = "name"
    }
}