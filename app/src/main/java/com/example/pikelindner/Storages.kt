package com.example.pikelindner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.lakes.*

class Storages: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.storages)
        supportActionBar?.hide()

//        button1lakes.setOnClickListener{
//            val intent = Intent(this, OligoLakeDescription::class.java)
//            startActivity(intent)
//        }


    }
}