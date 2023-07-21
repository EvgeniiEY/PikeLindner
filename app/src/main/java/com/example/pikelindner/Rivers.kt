package com.example.pikelindner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.lakes.OligoLakeDescription
import kotlinx.android.synthetic.main.rivers.*

class Rivers: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lakes)
        supportActionBar?.hide()

        button1Rivers.setOnClickListener{
            val intent = Intent(this, OligoLakeDescription::class.java)
            startActivity(intent)
        }
        button3Rivers.setOnClickListener{
            val intent = Intent(this, OligoLakeDescription::class.java)
            startActivity(intent)
        }
        button3Rivers.setOnClickListener{
            val intent = Intent(this, OligoLakeDescription::class.java)
            startActivity(intent)
        }


    }
}