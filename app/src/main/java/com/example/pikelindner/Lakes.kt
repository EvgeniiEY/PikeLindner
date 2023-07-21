package com.example.pikelindner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.lakes.EvtroLakeDescription
import com.example.pikelindner.lakes.MezoLakeDescription
import com.example.pikelindner.lakes.OligoLakeDescription
import kotlinx.android.synthetic.main.lakes.*
import kotlinx.android.synthetic.main.oligo_lake_description.*
import kotlinx.android.synthetic.main.ponds_categories.*

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