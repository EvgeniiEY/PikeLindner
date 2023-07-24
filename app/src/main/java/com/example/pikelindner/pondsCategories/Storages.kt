package com.example.pikelindner.pondsCategories

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.R
import com.example.pikelindner.pondsCategories.storages.HillsStorageDescription
import com.example.pikelindner.pondsCategories.storages.PlateauStorageDescription
import kotlinx.android.synthetic.main.storages.*

class Storages : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.storages)
        supportActionBar?.hide()

        button1storages.setOnClickListener {
            val intent = Intent(this, PlateauStorageDescription::class.java)
            startActivity(intent)
        }
        button2storages.setOnClickListener {
            val intent = Intent(this, HillsStorageDescription::class.java)
            startActivity(intent)
        }

        buttonBackStorages.setOnClickListener {
            val intent = Intent(this, PondsCategories::class.java)
            startActivity(intent)
        }
    }
}