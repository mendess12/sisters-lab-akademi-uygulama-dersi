package com.example.sisterslabakademiuygulamadersi.hafta4.soru3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.sisterslabakademiuygulamadersi.R
import com.example.sisterslabakademiuygulamadersi.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.toolbar.title = "Öğrenci Ders Notları"
        setSupportActionBar(binding.toolbar)

        binding.constraintOne.setOnClickListener {
            val detailIntentOne = Intent(this@HomeActivity, DetailActivity::class.java)
            detailIntentOne.putExtra("lessonName", "Türkçe")
            detailIntentOne.putExtra("teacherName", "Ali Kaya")
            detailIntentOne.putExtra("scoreOne", 50)
            detailIntentOne.putExtra("scoreTwo", 80)
            detailIntentOne.putExtra("average", 65)
            startActivity(detailIntentOne)
        }



        binding.constraintTwo.setOnClickListener {
            val detailIntentTwo = Intent(this@HomeActivity, DetailActivity::class.java)
            detailIntentTwo.putExtra("lessonName", "İngilizce")
            detailIntentTwo.putExtra("teacherName", "Yasemin Kılıç")
            detailIntentTwo.putExtra("scoreOne", 70)
            detailIntentTwo.putExtra("scoreTwo", 40)
            detailIntentTwo.putExtra("average", 50)
            startActivity(detailIntentTwo)
        }

        binding.constraintThree.setOnClickListener {
            val detailIntentThree = Intent(this@HomeActivity, DetailActivity::class.java)
            detailIntentThree.putExtra("lessonName", "Matematik")
            detailIntentThree.putExtra("teacherName", "Önder Şahin")
            detailIntentThree.putExtra("scoreOne", 65)
            detailIntentThree.putExtra("scoreTwo", 65)
            detailIntentThree.putExtra("average", 56)
            startActivity(detailIntentThree)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.student_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.search_view -> {
                Toast.makeText(applicationContext, "Search'e tiklandi", Toast.LENGTH_LONG).show()
                true
            }

            R.id.sign_out -> {
                val signOutIntent = Intent(this@HomeActivity, Ornek3::class.java)
                startActivity(signOutIntent)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}