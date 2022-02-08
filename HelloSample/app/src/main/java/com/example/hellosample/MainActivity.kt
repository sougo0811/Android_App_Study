package com.example.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val writeButton: Button = findViewById(R.id.writeButton)
        val resetButton: Button = findViewById(R.id.resetButton)
        val listener = HelloListener()
        val reset = HelloReset()
        writeButton.setOnClickListener(listener)
        resetButton.setOnClickListener(reset)
    }

    private inner class HelloListener : View.OnClickListener{
        override fun onClick(v: View?) {
            val inputName: EditText = findViewById(R.id.editText)
            val outputText: TextView = findViewById(R.id.outputText)
            val inputStr = inputName.text.toString()

            outputText.text = inputStr + "さん、こんばんは！"
        }
    }

    private  inner  class HelloReset : View.OnClickListener{
        override fun onClick(v: View?){
            val outputText: TextView = findViewById(R.id.outputText)
            outputText.text = ""
        }
    }
}