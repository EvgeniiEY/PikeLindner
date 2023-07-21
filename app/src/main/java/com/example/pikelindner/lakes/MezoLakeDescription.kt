package com.example.pikelindner.lakes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.Lakes
import com.example.pikelindner.R
import kotlinx.android.synthetic.main.oligo_lake_description.*

class MezoLakeDescription: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mezo_lake_description)
        supportActionBar?.hide()

        buttonBack.setOnClickListener{
            val intent = Intent(this, Lakes::class.java)
            startActivity(intent)
        }
        buttonNext.setOnClickListener{
            val intent = Intent(this, Lakes::class.java)
            startActivity(intent)
        }



    }
}