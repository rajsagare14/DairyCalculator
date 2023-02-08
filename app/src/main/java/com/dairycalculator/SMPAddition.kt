package com.dairycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SMPAddition : AppCompatActivity() {
    lateinit var requiredSNF : EditText
    lateinit var existingSNF : EditText
    lateinit var milkLiter : EditText
    lateinit var SNFSMP :EditText
    lateinit var result : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smpaddition)
        val calculate = findViewById<Button>(R.id.calculate)
        calculate.setOnClickListener(){
            requiredSNF = findViewById(R.id.requiredSNF)
            val reqSNF = requiredSNF.text.toString().toFloat()
            existingSNF = findViewById(R.id.existingSNF)
            val exiSNF = existingSNF.text.toString().toFloat()
            milkLiter = findViewById(R.id.milkLiter)
            val milkKg = milkLiter.text.toString().toFloat()/0.9707
            SNFSMP = findViewById(R.id.SNFSMP)
            val snfsmp = SNFSMP.text.toString().toFloat()
            val smpAdditionResult = (((reqSNF-exiSNF)*(milkKg))/snfsmp)
            result = findViewById(R.id.result)
            result.text = "Add SMP : ${smpAdditionResult} Kg"
        }
    }
}