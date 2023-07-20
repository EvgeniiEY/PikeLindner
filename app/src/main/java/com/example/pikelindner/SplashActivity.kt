package com.example.pikelindner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.fragment.app.FragmentManager
import com.example.pikelindner.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.instruction.*

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = R.layout.activity_main

        setContentView(view)
//        onClick(splashActivity)
        coverPike.setOnClickListener{
            val intent = Intent(this, Instruction::class.java)
            startActivity(intent)
        }

    }
//      override fun onClick(v: View?) {
//            splashActivity.setOnClickListener {
//                setContentView(R.layout.instruction)
//            }
//        }
    }


