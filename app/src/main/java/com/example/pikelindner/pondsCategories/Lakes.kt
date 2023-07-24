package com.example.pikelindner.pondsCategories

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.R
import com.example.pikelindner.pondsCategories.lakes.EvtroLakeDescription
import com.example.pikelindner.pondsCategories.lakes.MezoLakeDescription
import com.example.pikelindner.pondsCategories.lakes.OligoLakeDescription
import kotlinx.android.synthetic.main.lakes.*

class Lakes: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lakes)
        supportActionBar?.hide()

        button1lakes.setOnClickListener{
            val intent = Intent(this, OligoLakeDescription::class.java)
            startActivity(intent)
        }
        button2lakes.setOnClickListener{
            val intent = Intent(this, MezoLakeDescription::class.java)
            startActivity(intent)
        }
        button3lakes.setOnClickListener{
            val intent = Intent(this, EvtroLakeDescription::class.java)
            startActivity(intent)
        }
        buttonBackLakes.setOnClickListener{
            val intent = Intent(this, PondsCategories::class.java)
            startActivity(intent)
        }


    }
}