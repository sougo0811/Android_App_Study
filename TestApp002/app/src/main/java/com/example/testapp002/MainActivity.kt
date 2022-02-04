package com.example.testapp002

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberText: TextView = findViewById<TextView>(R.id.numberText)
        val plusButton: Button = findViewById(R.id.plusButton)
        val minusButton: Button = findViewById(R.id.minusButton)
        val resetButton: Button = findViewById(R.id.resetButton)
        val mysteryButton: Button = findViewById(R.id.mysteryButton)

        var num : Int = 0
        var sen : String = ""

        fun color_change(num : Int){


            if(num%2 == 0 && num%3 == 0){
                numberText.setTextColor(Color.parseColor("#ff7f50"))
            }
            else if(num%3 == 0){
                numberText.setTextColor(Color.parseColor("#ffff00"))
            }
            else if(num%2 == 0){
                numberText.setTextColor(Color.parseColor("#4169e1"))
            }
            else{
                numberText.setTextColor(Color.parseColor("#000000"))
            }
        }

        plusButton.setOnClickListener {
            num += 1

            color_change(num)

            numberText.text = num.toString()
        }

        minusButton.setOnClickListener {
            num -= 1

            color_change(num)

            numberText.text = num.toString()
        }

        resetButton.setOnClickListener {
            num = 0

            numberText.setTextColor(Color.parseColor("#000000"))
            numberText.text = num.toString()
        }

        mysteryButton.setOnClickListener {
            sen = "Yatoi"

            numberText.text = sen.toString()
        }


    }
}