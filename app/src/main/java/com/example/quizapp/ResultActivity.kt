package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var username = intent.getStringExtra(Constans.USER_NAME)
        var mCorrectQuestions = intent.getIntExtra(Constans.CORRECT_ANWERS, 0)
        var mtotalQuestions = intent.getIntExtra(Constans.TOTAL_QUESTIONS, 0)

        tv_name.text = username
        tv_score.text = "Your Score is $mCorrectQuestions out of $mtotalQuestions"

        btn_finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}