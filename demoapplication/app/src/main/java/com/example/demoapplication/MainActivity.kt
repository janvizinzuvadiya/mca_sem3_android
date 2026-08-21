package com.example.demoapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge();
        setContentView(R.layout.activity_main)

        val ed1 : EditText = findViewById(R.id.ed1)
        val ed2 : EditText = findViewById(R.id.ed2)

        val btn : Button = findViewById(R.id.button)

        val tv1 : TextView = findViewById(R.id.tv1)


        btn.setOnClickListener(View.OnClickListener{

            val str = "${ed1.text.toString()} ${ed2.text.toString()}";
            tv1.setText(str);
        });

    }
}