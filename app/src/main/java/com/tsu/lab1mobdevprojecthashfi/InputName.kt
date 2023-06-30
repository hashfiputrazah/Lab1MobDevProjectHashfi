package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.lab1mobdevprojecthashfi.databinding.NameInputBinding

class InputName : AppCompatActivity() {
    lateinit var binding: NameInputBinding //For Name Input page binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NameInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button2.setOnClickListener {
            val intent = Intent(this@InputName, ChooseActivity::class.java)
            intent.putExtra(ChooseActivity.NAME, binding.editTextTextPersonName3.text.toString())
            startActivity(intent)
        }
    }
}