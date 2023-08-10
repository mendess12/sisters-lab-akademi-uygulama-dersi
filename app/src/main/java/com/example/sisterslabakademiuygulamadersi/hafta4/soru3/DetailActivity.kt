package com.example.sisterslabakademiuygulamadersi.hafta4.soru3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisterslabakademiuygulamadersi.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val lessonName = intent.getStringExtra("lessonName")
        val teacherName = intent.getStringExtra("teacherName")
        val scoreOne = intent.getIntExtra("scoreOne",0)
        val scoreTwo = intent.getIntExtra("scoreTwo",0)
        val average = intent.getIntExtra("average",0)

        binding.detailScreenLessonName.text = lessonName.toString()
        binding.detailScreenTeacherName.text = teacherName.toString()
        binding.detailScreenScoreOne.text = "Vize Notu : $scoreOne"
        binding.detailScreenScoreTwo.text = "Final Notu : $scoreTwo"
        binding.detailScreenAverage.text = "Ortalama : $average"
    }
}