package com.example.pikelindner.rivers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.R
import com.example.pikelindner.Rivers
import kotlinx.android.synthetic.main.oligo_lake_description.*

class MatureRiverDescription: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mature_river_description)
        supportActionBar?.hide()

        buttonBack.setOnClickListener{
            val intent = Intent(this, Rivers::class.java)
            startActivity(intent)
        }
        buttonNext.setOnClickListener{
            val intent = Intent(this, Rivers::class.java)
            startActivity(intent)
        }



    }
}