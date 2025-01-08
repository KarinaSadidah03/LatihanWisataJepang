package com.zukira.latihanwisatajepang

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var imgScreenSplash: ImageView
    private lateinit var nama: TextView
    private lateinit var tempat: TextView
    private lateinit var detail: TextView
    private lateinit var btnDetail : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)

        imgScreenSplash = findViewById(R.id.imgScreenSplash)
        nama = findViewById(R.id.nama)
        tempat = findViewById(R.id.tempat)
        detail = findViewById(R.id.detail)
        btnDetail = findViewById(R.id.btnDetail)

        //get data dari intent
        val imgnya = intent.getIntExtra("gambar", 0)
        val namanya = intent.getStringExtra("nama")
        val tempatnya = intent.getStringExtra("tempat")
        val detailnya = intent.getStringExtra("detail")


        //set data ke widget
        imgScreenSplash.setImageResource(imgnya)
        nama.setText(namanya)
        tempat.setText(tempatnya)
        detail.setText(detailnya)

        btnDetail.setOnClickListener() {
            intent = Intent(this@SplashScreenActivity, DetailActivity::class.java)
            intent.putExtra("gambar", imgnya)
            intent.putExtra("nama", namanya)
            intent.putExtra("tempat", tempatnya)
            intent.putExtra("detail", detailnya)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}