package com.dairycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SMPProduction : AppCompatActivity() {
    lateinit var milkInLiter: EditText
    lateinit var SNFOfMilk: EditText
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smpproduction)
        val calculate = findViewById<Button>(R.id.calculate)
        calculate.setOnClickListener(){
            milkInLiter = findViewById(R.id.milkInLiter)
            SNFOfMilk = findViewById(R.id.SNFOfMilk)
            result = findViewById(R.id.result)
//            var butterProduction: Float
            val milkKG = ((milkInLiter.text.toString().toFloat())/0.9707)
            val fat = SNFOfMilk.text.toString().toFloat()
            val SNFProduction = (milkKG*fat*0.97)/100
            result.text = "Butter Production: ${SNFProduction}"
        }
    }
}