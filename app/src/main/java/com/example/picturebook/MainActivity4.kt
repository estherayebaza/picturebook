package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    lateinit var btn4: Button
    lateinit var btnButton4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page4)
        castView4()
        onClick4()
    }
    fun castView4(){

        btn4=findViewById(R.id.btn4)
        btnButton4=findViewById(R.id.btnButton4)



    }
    fun onClick4() {
        val next5= Intent(baseContext,MainActivity5::class.java)
        startActivity(next5)
        val Back4= Intent(baseContext,MainActivity3::class.java)
        startActivity(Back4)
    }
}