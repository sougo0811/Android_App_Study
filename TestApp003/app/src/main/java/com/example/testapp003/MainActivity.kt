package com.example.testapp003

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countNum: TextView = findViewById<TextView>(R.id.countNum)
        val plusButton: Button = findViewById(R.id.plusButton)
        val minusButton: Button = findViewById(R.id.minusButton)
        val resetButton: Button = findViewById(R.id.resetButton)
        val specialButton: Button = findViewById(R.id.specialButton)

        var num : Int = 0
        var sen : String = ""
        var total : Int = 0

        fun color_change(num : Int){


            if(num%2 == 0 && num%3 == 0){
                countNum.setTextColor(Color.parseColor("#ff7f50"))
            }
            else if(num%3 == 0){
                countNum.setTextColor(Color.parseColor("#ffff00"))
            }
            else if(num%2 == 0){
                countNum.setTextColor(Color.parseColor("#4169e1"))
            }
            else{
                countNum.setTextColor(Color.parseColor("#000000"))
            }
        }

        plusButton.setOnClickListener {
            num += 1

            color_change(num)

            countNum.text = num.toString()
        }

        minusButton.setOnClickListener {
            num -= 1

            color_change(num)

            countNum.text = num.toString()
        }

        resetButton.setOnClickListener {
            num = 0

            countNum.setTextColor(Color.parseColor("#000000"))
            countNum.text = num.toString()
        }

        specialButton.setOnClickListener {
            sen = "Yatoi."
            countNum.text = sen.toString()
        }

    }
}