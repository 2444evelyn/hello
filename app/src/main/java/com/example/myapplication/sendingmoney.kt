package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sendingmoney : AppCompatActivity() {
    lateinit var btnCancel: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sendingmoney)
        btnCancel=findViewById(R.id.btnCancel)
        btnCancel.setOnClickListener {
            val intent = Intent(this,BMICalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}