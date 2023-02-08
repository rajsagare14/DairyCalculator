package com.dairycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.dairycalculator.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val snfCalculator = findViewById<Button>(R.id.snfCalculator)
        snfCalculator.setOnClickListener(){
            val intent = Intent(this,SNFCalculator::class.java)
            startActivity(intent)
        }
        val smpCalculator = findViewById<Button>(R.id.skimmedMilkProductionCalculator)
        smpCalculator.setOnClickListener(){
            val intent = Intent(this,SkimmedMilkProduction::class.java)
            startActivity(intent)
        }
        val smpAdditionCalculator = findViewById<Button>(R.id.smpCalculator)
        smpAdditionCalculator.setOnClickListener(){
            val intent = Intent(this,SMPAddition::class.java)
            startActivity(intent)
        }
    }
}