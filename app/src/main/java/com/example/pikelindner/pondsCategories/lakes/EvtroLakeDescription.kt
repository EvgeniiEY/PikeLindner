package com.example.pikelindner.pondsCategories.lakes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.pondsCategories.Lakes
import com.example.pikelindner.R
import com.example.pikelindner.TemperatureChoosingPeriod
import kotlinx.android.synthetic.main.oligo_lake_description.*

class EvtroLakeDescription: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.evtro_lake_description)
        supportActionBar?.hide()

        buttonBack.setOnClickListener{
            val intent = Intent(this, Lakes::class.java)
            startActivity(intent)
        }
        buttonNext.setOnClickListener{
            val intent = Intent(this, TemperatureChoosingPeriod::class.java)
            startActivity(intent)
        }



    }
}