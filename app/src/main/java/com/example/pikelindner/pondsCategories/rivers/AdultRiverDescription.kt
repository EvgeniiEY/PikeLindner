package com.example.pikelindner.pondsCategories.rivers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.R
import com.example.pikelindner.TemperatureChoosingPeriod
import com.example.pikelindner.pondsCategories.Rivers
import kotlinx.android.synthetic.main.oligo_lake_description.*

class AdultRiverDescription: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adult_river_description)
        supportActionBar?.hide()

        buttonBack.setOnClickListener{
            val intent = Intent(this, Rivers::class.java)
            startActivity(intent)
        }
        buttonNext.setOnClickListener{
            val intent = Intent(this, TemperatureChoosingPeriod::class.java)
            startActivity(intent)
        }



    }
}