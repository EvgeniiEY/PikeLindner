package com.example.pikelindner

import android.content.Intent
import android.os.Bundle
import android.text.Selection.setSelection
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pikelindner.pondsCategories.PondsCategories
import com.example.pikelindner.pondsCategories.Rivers
import com.example.pikelindner.pondsCategories.Storages
import kotlinx.android.synthetic.main.oligo_lake_description.*
import kotlinx.android.synthetic.main.temperature_choosing_period.*
import kotlinx.android.synthetic.main.temperature_choosing_period.view.*

class TemperatureChoosingPeriod : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.temperature_choosing_period)
        supportActionBar?.hide()

        buttonBackTempChoosing.setOnClickListener {
            val intent = Intent(this, PondsCategories::class.java)
            startActivity(intent)
        }

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

        val degree = arrayListOf(
            0,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11,
            12,
            13,
            14,
            15,
            16,
            17,
            18,
            19,
            20,
            21,
            22,
            23,
            24,
            25,
            26,
            27,
            28,
            29,
            30,
            31,
            32,
            33,
            34,
            35
        )

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
                parent?.getChildAt(0)?.background?.colorFilter
                var chosenTemp = position.toString()
                Toast.makeText(baseContext, chosenTemp, Toast.LENGTH_SHORT).show()
                period_chosen.text = chosenTemp

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}