package com.example.pikelindner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.temperature_choosing_period.*
import kotlinx.android.synthetic.main.temperature_choosing_period.view.*

class TemperatureChoosingPeriod : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.temperature_choosing_period)
        supportActionBar?.hide()

        val month = arrayListOf(
            "Январь",
            "Февраль",
            "Март",
            "Апрель",
            "Май",
            "Июнь",
            "Июль",
            "Август",
            "Сентябрь",
            "Октябрь",
            "Ноябрь",
            "Декабрь"
        )

        val degree = arrayListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, degree)
        spinnerTemp.adapter = arrayAdapter
        spinnerTemp.onItemSelectedListener = object :


            AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
//                degreeNumber.text = degree[view.]

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }


}