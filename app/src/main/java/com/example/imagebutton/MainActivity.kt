package com.example.imagebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = findViewById<ImageView>(R.id.imageButton)as ImageButton
        img.setOnClickListener {
            Toast.makeText(this@MainActivity,"Image Button was Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}