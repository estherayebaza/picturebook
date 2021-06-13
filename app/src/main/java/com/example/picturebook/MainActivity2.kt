package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var btnNext2:Button
    lateinit var btnBack2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)
        castView2()
        onClick2()
    }
    fun castView2(){

            btnNext2=findViewById(R.id.btnNext2)
        btnBack2=findViewById(R.id.btnBack2)

    }
    fun onClick2() {
        val next2= Intent(baseContext,MainActivity3::class.java)
        startActivity(next2)
        val Back2=Intent(baseContext,MainActivity::class.java)
        startActivity(Back2)
    }
}