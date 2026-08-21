package com.example.calculatorapp

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
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val ed1 : EditText = findViewById(R.id.ed1);
        val ed2 : EditText = findViewById(R.id.ed2);

        val res : TextView = findViewById(R.id.textView4);

        val add : Button = findViewById(R.id.btn1);
        val sub : Button = findViewById(R.id.btn2);
        val mul : Button = findViewById(R.id.btn3);
        val div : Button = findViewById(R.id.btn4);

        add.setOnClickListener ( View.OnClickListener{

            val ans = ed1.text.toString().toInt() + ed2.text.toString().toInt();
            res.setText("Output: {$ans}")

        } );

        sub.setOnClickListener ( View.OnClickListener{

            val ans = ed1.text.toString().toInt() - ed2.text.toString().toInt();
            res.setText("Output: {$ans}")

        } );

        mul.setOnClickListener ( View.OnClickListener{

            val ans = ed1.text.toString().toInt() * ed2.text.toString().toInt();
            res.setText("Output: {$ans}")

        } );

        div.setOnClickListener ( View.OnClickListener{

            val ans = ed1.text.toString().toInt() / ed2.text.toString().toInt();
            res.setText("Output: {$ans}")

        } );

    }
}