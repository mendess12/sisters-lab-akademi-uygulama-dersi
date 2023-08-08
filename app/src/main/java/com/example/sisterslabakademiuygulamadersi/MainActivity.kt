package com.example.sisterslabakademiuygulamadersi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisterslabakademiuygulamadersi.databinding.ActivityMainBinding
import com.example.sisterslabakademiuygulamadersi.hafta4.soru1.Ornek1
import com.example.sisterslabakademiuygulamadersi.hafta4.soru2.Ornek2

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.exampleOne.setOnClickListener {
            val exampleOneIntent = Intent(this@MainActivity, Ornek1::class.java)
            startActivity(exampleOneIntent)
        }

        binding.exampleTwo.setOnClickListener {
            val exampleOneIntent = Intent(this@MainActivity, Ornek2::class.java)
            startActivity(exampleOneIntent)
        }
    }
}