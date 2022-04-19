package com.cna.mobileprogramming.movieBuff.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cna.mobileprogramming.foodie.R

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)


        val allMoviesBtn = findViewById<Button>(R.id.allMovieBtn)
        val highRatedMovieBtn = findViewById<Button>(R.id.highRatedMoviesBtn)

        allMoviesBtn.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        highRatedMovieBtn.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("type","highRated")
            startActivity(intent)
        }

    }
}