package com.dairycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CreamAddition : AppCompatActivity() {
    lateinit var requiredFat : EditText
    lateinit var existingFat : EditText
    lateinit var milkLiter : EditText
    lateinit var creamFat :EditText
    lateinit var result : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cream_addition)
        val calculate = findViewById<Button>(R.id.calculate)
        calculate.setOnClickListener(){
            requiredFat = findViewById(R.id.requiredSNF)
            val reqFat = requiredFat.text.toString().toFloat()
            existingFat = findViewById(R.id.existingSNF)
            val exiFat = existingFat.text.toString().toFloat()
            milkLiter = findViewById(R.id.milkLiter)
            val milkKg = milkLiter.text.toString().toFloat()/0.9707
            creamFat = findViewById(R.id.creamFat)
            val fat = creamFat.text.toString().toFloat()
            val creamAdditionResult = (((reqFat-exiFat)*(milkKg))/fat)
            result = findViewById(R.id.result)
            result.text = "Add SMP : ${creamAdditionResult} Kg"
        }
    }
}