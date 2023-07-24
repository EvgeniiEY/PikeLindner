package com.example.pikelindner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.pondsCategories.PondsCategories
import kotlinx.android.synthetic.main.instruction.*


class Instruction: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.instruction)
        supportActionBar?.hide()

        buttonBegin.setOnClickListener{
            val intent = Intent(this, PondsCategories::class.java)
            startActivity(intent)
        }
    }

}