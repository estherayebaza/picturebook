package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    lateinit var btnNext3: Button
    lateinit var btnBack3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page3)
        castView3()
        onClick3()
    }
    fun castView3(){

        btnNext3=findViewById(R.id.btnNext3)
        btnBack3=findViewById(R.id.btnBack3)

    }
    fun onClick3() {
        val next3= Intent(baseContext,MainActivity4::class.java)
        startActivity(next3)
        val back3= Intent(baseContext,MainActivity2::class.java)
        startActivity(back3)
    }
}