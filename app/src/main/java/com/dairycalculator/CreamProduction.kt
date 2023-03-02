package com.dairycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CreamProduction : AppCompatActivity() {
    lateinit var milkInLiter: EditText
    lateinit var fatOfMilk: EditText
    lateinit var creamFatToBeMaintained: EditText
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cream_production)
        val calculate = findViewById<Button>(R.id.calculate)
        calculate.setOnClickListener(){
            milkInLiter = findViewById(R.id.milkInLiter)
            fatOfMilk = findViewById(R.id.fatOfMilk)
            creamFatToBeMaintained = findViewById(R.id.creamFatToBeMaintained)
            result = findViewById(R.id.result)
            val milkKG = ((milkInLiter.text.toString().toFloat())/0.9707)
            val fat = fatOfMilk.text.toString().toFloat()
            val creamFat = creamFatToBeMaintained.text.toString().toFloat()
            val creamProduction = (milkKG*fat)/creamFat
            result.text = "Cream Production: ${creamProduction}"
        }
    }
}