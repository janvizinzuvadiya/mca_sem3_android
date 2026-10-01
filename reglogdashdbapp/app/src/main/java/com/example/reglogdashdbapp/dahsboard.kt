package com.example.reglogdashdbapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dahsboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dahsboard)

        val wel = intent.getStringExtra("unm");

        val tv = findViewById<TextView>(R.id.textView);
        tv.setText("WELCOME ${wel} !!");

    }
}