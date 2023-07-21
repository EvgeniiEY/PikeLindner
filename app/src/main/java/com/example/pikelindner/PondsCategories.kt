package com.example.pikelindner

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
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
            val intent = Intent(this, Instruction::class.java)
            startActivity(intent)
        }

        buttonStoragePond.setOnClickListener{
            val intent = Intent(this, Instruction::class.java)
            startActivity(intent)
        }

    }
}