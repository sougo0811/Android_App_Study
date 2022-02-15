package com.example.constraintlayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class completionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_completion)

        val name = intent.getSerializableExtra("name")
        val thank: TextView = findViewById(R.id.thankText)
        /*nameText.text = name.toString()*/
        println(name)
    }

}