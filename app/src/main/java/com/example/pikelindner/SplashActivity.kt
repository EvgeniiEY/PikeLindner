package com.example.pikelindner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import com.example.pikelindner.databinding.ActivityMainBinding

class SplashActivity : AppCompatActivity(), OnClickListener{
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = R.layout.activity_main
        setContentView(view)






        val listener= OnClickListener { view ->
        when (view.getId()) {
            R.id.coverPike -> {
                R.layout.instruction
            }
        }
    }




    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }


}


