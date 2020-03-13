package com.example.iphertranslate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun CaesarCodeFunc(view: View){
        setContentView(R.layout.activity_caesar_code)
    }


}
