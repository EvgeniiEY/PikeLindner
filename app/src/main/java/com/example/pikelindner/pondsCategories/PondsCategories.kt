package com.example.pikelindner.pondsCategories

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.R
import kotlinx.android.synthetic.main.ponds_categories.*


class PondsCategories : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ponds_categories)
        supportActionBar?.hide()

        buttonLakes.setOnClickListener{
            val intent = Intent(this, Lakes::class.java)
            startActivity(intent)
        }

        buttonRivers.setOnClickListener{
            val intent = Intent(this, Rivers::class.java)
            startActivity(intent)
        }

        buttonStoragePond.setOnClickListener{
            val intent = Intent(this, Storages::class.java)
            startActivity(intent)
        }

    }
}