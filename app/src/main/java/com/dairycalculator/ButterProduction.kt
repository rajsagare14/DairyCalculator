package com.dairycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ButterProduction : AppCompatActivity() {
    lateinit var milkInLiter: EditText
    lateinit var fatOfMilk: EditText
    lateinit var expectedButterFat: EditText
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butter_production)
        val calculate = findViewById<Button>(R.id.calculate)
        calculate.setOnClickListener(){
            milkInLiter = findViewById(R.id.milkInLiter)
            fatOfMilk = findViewById(R.id.fatOfMilk)
            expectedButterFat = findViewById(R.id.expectedButterFat)
            result = findViewById(R.id.result)
//            var butterProduction: Float
            val milkKG = ((milkInLiter.text.toString().toFloat())/0.9707)
            val fat = fatOfMilk.text.toString().toFloat()
            val expectedFat = expectedButterFat.text.toString().toFloat()
            val butterProduction = (milkKG*fat*0.97)/expectedFat
            result.text = "Butter Production: ${butterProduction}"
        }
    }
}