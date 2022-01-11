package com.example.testapp001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberText: TextView = findViewById<TextView>(R.id.numberView)
        val plusButton: Button = findViewById(R.id.plusButton)
        val resetButton: Button = findViewById(R.id.resetButton)

        var num : Int = 0

        plusButton.setOnClickListener {
            num += 1

            numberText.text = num.toString()
        }

        resetButton.setOnClickListener {
            num = 0

            numberText.text = num.toString()
        }
    }

}