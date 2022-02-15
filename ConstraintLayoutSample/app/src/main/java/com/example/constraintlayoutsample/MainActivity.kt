package com.example.constraintlayoutsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val listener = clickListener()

        val confirmButton: Button = findViewById(R.id.confirmButton)
        confirmButton.setOnClickListener(listener)
        val clearButton: Button = findViewById(R.id.clearButton)
        clearButton.setOnClickListener(listener)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var returnVal = true
        if(item.itemId == android.R.id.home){
            finish()
        }else{
            returnVal = super.onOptionsItemSelected(item)
        }
        return returnVal
    }

    private inner class clickListener : View.OnClickListener{
        override fun onClick(view: View){
            val name: EditText = findViewById(R.id.nameEdit)
            val email: EditText = findViewById(R.id.emailEdit)
            val content: EditText = findViewById(R.id.contentEdit)

            when(view.id){
                R.id.confirmButton -> {
                    val intentCompletionActivity = Intent(this@MainActivity, completionActivity::class.java)
                    intentCompletionActivity.putExtra("name",name.text.toString())
                    val dialogFragment = QuestionDialogFragment()
                    dialogFragment.show(supportFragmentManager, "QuestionDialogFragment")
                }
                R.id.clearButton -> {
                    name.setText("")
                    email.setText("")
                    content.setText("")
                }
            }
        }
    }

}