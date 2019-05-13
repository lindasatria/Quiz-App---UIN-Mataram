package com.khairunlabs.kiosapaapa.quiz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.khairunlabs.kiosapaapa.R
import kotlinx.android.synthetic.main.activity_quiz_level2.*

class QuizLevel2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_level2)

        var score = 0
        var dijawab = 0

        txt_quiz_level2_soal1.text = resources.getString(R.string.level2_soal1)
        rb_quiz_level2_soal1_pilihan_a.text = resources.getString(R.string.level2_pilihanganda_soal1_a)
        rb_quiz_level2_soal1_pilihan_a.text = resources.getString(R.string.level2_pilihanganda_soal1_a)
        rb_quiz_level2_soal1_pilihan_b.text = resources.getString(R.string.level2_pilihanganda_soal1_b)
        rb_quiz_level2_soal1_pilihan_c.text = resources.getString(R.string.level2_pilihanganda_soal1_c)
        rb_quiz_level2_soal1_pilihan_d.text = resources.getString(R.string.level2_pilihanganda_soal1_d)
        var jawaban_soal1 = resources.getString(R.string.level2_jawaban_soal1)

        txt_quiz_level2_soal2.text = resources.getString(R.string.level2_soal2)
        rb_quiz_level2_soal2_pilihan_a.text = resources.getString(R.string.level2_pilihanganda_soal2_a)
        rb_quiz_level2_soal2_pilihan_a.text = resources.getString(R.string.level2_pilihanganda_soal2_a)
        rb_quiz_level2_soal2_pilihan_b.text = resources.getString(R.string.level2_pilihanganda_soal2_b)
        rb_quiz_level2_soal2_pilihan_c.text = resources.getString(R.string.level2_pilihanganda_soal2_c)
        rb_quiz_level2_soal2_pilihan_d.text = resources.getString(R.string.level2_pilihanganda_soal2_d)
        var jawaban_soal2 = resources.getString(R.string.level2_jawaban_soal2)

        txt_quiz_level2_soal3.text = resources.getString(R.string.level2_soal3)
        rb_quiz_level2_soal3_pilihan_a.text = resources.getString(R.string.level2_pilihanganda_soal3_a)
        rb_quiz_level2_soal3_pilihan_a.text = resources.getString(R.string.level2_pilihanganda_soal3_a)
        rb_quiz_level2_soal3_pilihan_b.text = resources.getString(R.string.level2_pilihanganda_soal3_b)
        rb_quiz_level2_soal3_pilihan_c.text = resources.getString(R.string.level2_pilihanganda_soal3_c)
        rb_quiz_level2_soal3_pilihan_d.text = resources.getString(R.string.level2_pilihanganda_soal3_d)
        var jawaban_soal3 = resources.getString(R.string.level2_jawaban_soal3)

        txt_quiz_level2_soal4.text = resources.getString(R.string.level2_soal4)
        rb_quiz_level2_soal4_pilihan_a.text = resources.getString(R.string.level2_pilihanganda_soal4_a)
        rb_quiz_level2_soal4_pilihan_a.text = resources.getString(R.string.level2_pilihanganda_soal4_a)
        rb_quiz_level2_soal4_pilihan_b.text = resources.getString(R.string.level2_pilihanganda_soal4_b)
        rb_quiz_level2_soal4_pilihan_c.text = resources.getString(R.string.level2_pilihanganda_soal4_c)
        rb_quiz_level2_soal4_pilihan_d.text = resources.getString(R.string.level2_pilihanganda_soal4_d)
        var jawaban_soal4 = resources.getString(R.string.level2_jawaban_soal4)

        txt_quiz_level2_soal5.text = resources.getString(R.string.level2_soal5)
        rb_quiz_level2_soal5_pilihan_a.text = resources.getString(R.string.level2_pilihanganda_soal5_a)
        rb_quiz_level2_soal5_pilihan_a.text = resources.getString(R.string.level2_pilihanganda_soal5_a)
        rb_quiz_level2_soal5_pilihan_b.text = resources.getString(R.string.level2_pilihanganda_soal5_b)
        rb_quiz_level2_soal5_pilihan_c.text = resources.getString(R.string.level2_pilihanganda_soal5_c)
        rb_quiz_level2_soal5_pilihan_d.text = resources.getString(R.string.level2_pilihanganda_soal5_d)
        var jawaban_soal5 = resources.getString(R.string.level2_jawaban_soal5)

        btn_hasil_quiz_leve2.setOnClickListener {
            if (rb_quiz_level2_soal1_pilihan_a.isChecked && "A" == jawaban_soal1) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal1_pilihan_b.isChecked && "B" == jawaban_soal1) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal1_pilihan_b.isChecked && "C" == jawaban_soal1) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal1_pilihan_b.isChecked && "D" == jawaban_soal1) { score += 20; dijawab += 1 }

            if (rb_quiz_level2_soal2_pilihan_a.isChecked && "A" == jawaban_soal2) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal2_pilihan_b.isChecked && "B" == jawaban_soal2) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal2_pilihan_b.isChecked && "C" == jawaban_soal2) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal2_pilihan_b.isChecked && "D" == jawaban_soal2) { score += 20; dijawab += 1 }

            if (rb_quiz_level2_soal3_pilihan_a.isChecked && "A" == jawaban_soal3) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal3_pilihan_b.isChecked && "B" == jawaban_soal3) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal3_pilihan_b.isChecked && "C" == jawaban_soal3) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal3_pilihan_b.isChecked && "D" == jawaban_soal3) { score += 20; dijawab += 1 }

            if (rb_quiz_level2_soal4_pilihan_a.isChecked && "A" == jawaban_soal4) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal4_pilihan_b.isChecked && "B" == jawaban_soal4) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal4_pilihan_b.isChecked && "C" == jawaban_soal4) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal4_pilihan_b.isChecked && "D" == jawaban_soal4) { score += 20; dijawab += 1 }

            if (rb_quiz_level2_soal5_pilihan_a.isChecked && "A" == jawaban_soal5) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal5_pilihan_b.isChecked && "B" == jawaban_soal5) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal5_pilihan_b.isChecked && "C" == jawaban_soal5) { score += 20; dijawab += 1 }
            else if (rb_quiz_level2_soal5_pilihan_b.isChecked && "D" == jawaban_soal5) { score += 20; dijawab += 1 }

            val builder = AlertDialog.Builder(this)
            builder.setMessage("Jumlah Soal yang dijawab : {$dijawab}\nScore Anda : {$score}")
            builder.setPositiveButton("Kembali"){ _, _ ->
                onBackPressed()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
}
