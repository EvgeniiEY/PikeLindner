package com.example.pikelindner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.lakes.OligoLakeDescription
import com.example.pikelindner.rivers.AdultRiverDescription
import com.example.pikelindner.rivers.MatureRiverDescription
import com.example.pikelindner.rivers.MiddleAgeRiverDescription
import kotlinx.android.synthetic.main.lakes.*
import kotlinx.android.synthetic.main.rivers.*

class Rivers: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rivers)
        supportActionBar?.hide()

        button1Rivers.setOnClickListener{
            val intent = Intent(this, AdultRiverDescription::class.java)
            startActivity(intent)
        }
        button2Rivers.setOnClickListener{
            val intent = Intent(this, MatureRiverDescription::class.java)
            startActivity(intent)
        }
        button3Rivers.setOnClickListener{
            val intent = Intent(this, MiddleAgeRiverDescription::class.java)
            startActivity(intent)
        }
        buttonBackRivers.setOnClickListener{
            val intent = Intent(this, PondsCategories::class.java)
            startActivity(intent)
        }


    }
}