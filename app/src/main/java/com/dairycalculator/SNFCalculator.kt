package com.dairycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.dairycalculator.R

class SNFCalculator : AppCompatActivity() {
    lateinit var fat: EditText
    lateinit var lr: EditText
    lateinit var temp: EditText
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snfcalculator)
        val calculate = findViewById<Button>(R.id.calculate)
        calculate.setOnClickListener(){
            fat = findViewById(R.id.fatVal)
            lr = findViewById(R.id.lrVal)
            temp = findViewById(R.id.tempVal)
            result = findViewById(R.id.result)
            val f = fat.text.toString().toFloat()
            val lacto = lr.text.toString().toFloat()
            val t = temp.text.toString().toFloat()
            var clr:Float
            val snf:Float
            if (t>=70.0){
                clr = (lacto + ((t-70)*0.2)).toFloat()
            }
            else{
                clr = (lacto - ((70 - t)*0.2)).toFloat()
            }
            snf = ((f*0.21)+((clr/4)+0.36)).toFloat()
            result.text = "Fat = ${f}\nLactometer Reading(LR) = ${lacto}\nTemprature = ${t}\u00B0F\nCorrected LR (CLR) = ${clr}\nSoluble Natural Fat\nSNF = ${snf}\n"
        }
    }
}