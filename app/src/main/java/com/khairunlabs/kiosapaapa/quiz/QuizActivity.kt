package com.khairunlabs.kiosapaapa.quiz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.khairunlabs.kiosapaapa.MainActivity
import com.khairunlabs.kiosapaapa.R
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        btn_quiz_level1.setOnClickListener {
            startActivity(Intent(this, QuizLevel1Activity::class.java))
        }

        btn_quiz_level2.setOnClickListener {
            startActivity(Intent(this, QuizLevel2Activity::class.java))
        }

        btn_quiz_level3.setOnClickListener {
            startActivity(Intent(this, QuizLevel3Activity::class.java))
        }
    }
}
