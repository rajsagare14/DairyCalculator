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
        val butterProductionCalculator = findViewById<Button>(R.id.butterCalculator)
        butterProductionCalculator.setOnClickListener(){
            val intent = Intent(this,ButterProduction::class.java)
            startActivity(intent)
        }
        val creamProductionCalculator = findViewById<Button>(R.id.creamProductionCalculator)
        creamProductionCalculator.setOnClickListener(){
            val intent = Intent(this,CreamProduction::class.java)
            startActivity(intent)
        }
        val creamAdditionCalculator = findViewById<Button>(R.id.creamAdditionCalculator)
        creamAdditionCalculator.setOnClickListener(){
            val intent = Intent(this,CreamAddition::class.java)
            startActivity(intent)
        }
        val SMPProductionCalculator = findViewById<Button>(R.id.smpProductionCalculator)
        SMPProductionCalculator.setOnClickListener(){
            val intent = Intent(this,SMPProduction::class.java)
            startActivity(intent)
        }
    }
}