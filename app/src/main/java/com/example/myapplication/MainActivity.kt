package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun falseAnswer(viewThatGotClicked: View) {
        Toast.makeText(this, "Wrong Answer , Try Again!!!", Toast.LENGTH_SHORT).show()

    }

    fun goodAnswer(v: View)

    {
        Toast.makeText(this,"Good Answer !!! Do the next question",Toast.LENGTH_SHORT).show()
        val intent=Intent(this,Main2Activity2::class.java)
        startActivity(intent)
    }




}


