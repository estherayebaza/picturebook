package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {

    lateinit var btnBackAll: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page5)
        castView5()
        onClick5()
    }

    fun castView5(){

        btnBackAll=findViewById(R.id.btnBackAll)

    }
    fun onClick5() {

        val Back5= Intent(baseContext,MainActivity4::class.java)
       startActivity(Back5)

    }
}