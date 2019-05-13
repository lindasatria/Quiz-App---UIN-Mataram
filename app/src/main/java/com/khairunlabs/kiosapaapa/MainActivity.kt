package com.khairunlabs.kiosapaapa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import com.khairunlabs.kiosapaapa.quiz.QuizActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_materi.setOnClickListener {
            startActivity(Intent(this, MateriActivity::class.java))
        }

        btn_quiz.setOnClickListener {
            startActivity(Intent(this, QuizActivity::class.java))
        }

        btn_about.setOnClickListener {
            var nama_app = resources.getString(R.string.app_name)
            var nama_pembuat = resources.getString(R.string.nama_pembuat)
            var nim = resources.getString(R.string.nim)
            var jurusan = resources.getString(R.string.jurusan)
            var fakultas = resources.getString(R.string.Fakultas)
            var kampus = resources.getString(R.string.kampus)
            val builder = AlertDialog.Builder(this)
                .setMessage("Nama Aplikasi : {$nama_app}\n\n"+
                    "Nama pembuat : {$nama_pembuat}\n\n"+
                    "NIM : {$nim}\n\n"+
                    "Jurusan : {$jurusan}\n\n"+
                    "Fakultas : {$fakultas}\n\n"+
                    "Kampus : {$kampus}\n\n")
                .setPositiveButton("Kembali")
                { _, _ ->
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        btn_exit.setOnClickListener {
            finish()
            onDestroy()
        }
    }

}
