package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.ActivityChooseBinding

class ChooseActivity : AppCompatActivity() {
    lateinit var binding: ActivityChooseBinding //For Activity Choose page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val name = intent.getStringExtra(NAME)
        binding.textView3.text = getString(R.string.great_text, name)

        binding.button3.setOnClickListener {
            val intent = Intent(this@ChooseActivity, Running::class.java)
            startActivity(intent)
        }

        binding.button4.setOnClickListener {
            val intent = Intent(this@ChooseActivity, Camping::class.java)
            startActivity(intent)
        }

        binding.button5.setOnClickListener {
            val intent = Intent(this@ChooseActivity, Hiking::class.java)
            startActivity(intent)
        }
    }

    companion object {
        const val NAME = "name"
    }
}