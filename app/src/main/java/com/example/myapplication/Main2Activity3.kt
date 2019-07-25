package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Main2Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main23)
    }
    fun falseAnswer(viewThatGotClicked: View){

        Toast.makeText(this, "Wrong  Answer Try Again", Toast.LENGTH_SHORT).show()
    }

    fun goodAnswer(v : View)
    {
        Toast.makeText(this, "Right Answer Do the Next Question ", Toast.LENGTH_SHORT).show()
        val Intent= Intent(this,Main2Activity31::class.java)
        startActivity(Intent)
    }

}
