package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page1)
        castView()
        onClick()
    }
    fun castView(){
        btnNext1=findViewById(R.id.btnNext1)
    }
    fun onClick() {
         val next=Intent(baseContext,MainActivity2::class.java)
        startActivity(next)
    }
}