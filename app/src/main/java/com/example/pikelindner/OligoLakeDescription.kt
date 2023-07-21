package com.example.pikelindner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.instruction.*
import kotlinx.android.synthetic.main.oligo_lake_description.*
//todo сделать после активити категории озёр

class OligoLakeDescription: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oligo_lake_description)
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