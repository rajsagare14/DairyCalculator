package com.dairycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SkimmedMilkProduction : AppCompatActivity() {
    lateinit var milkInLiter: EditText
    lateinit var creamInLiter: EditText
    lateinit var resultsmp: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skimmed_milk_production)
        val calculate = findViewById<Button>(R.id.calculate)
        var milk:Float
        var cream:Double
        var skimmedMilkProduction:Float
        calculate.setOnClickListener(){
            resultsmp = findViewById(R.id.result)
            milkInLiter = findViewById<EditText?>(R.id.milkLiter)
            milk = milkInLiter.text.toString().toFloat()
            creamInLiter = findViewById(R.id.creamKg)
            cream = creamInLiter.text.toString().toFloat()/0.99
            skimmedMilkProduction = (milk-cream).toFloat()
            resultsmp.text = "Skimmed Milk Production = ${skimmedMilkProduction}"
        }
    }
}