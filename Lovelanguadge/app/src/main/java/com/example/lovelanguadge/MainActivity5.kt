package com.example.lovelanguadge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    lateinit var btn7: Button
    lateinit var btn8: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        btn7 = findViewById(R.id.button7)
        btn8 = findViewById(R.id.button8)
        btn7.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))}
        btn8.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))}
    }
}