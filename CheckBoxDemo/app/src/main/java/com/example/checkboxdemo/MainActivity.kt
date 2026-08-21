package com.example.checkboxdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
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

        var str = "";

        val ch1 : CheckBox = findViewById(R.id.ch1);
        val ch2 : CheckBox = findViewById(R.id.ch2);
        val ch3 : CheckBox = findViewById(R.id.ch3);

        val btn : Button = findViewById(R.id.button);

        val tv1 : TextView = findViewById(R.id.textView);

        btn.setOnClickListener {
            if(ch1.isChecked)
            {
                str += ch1.text.toString() + " ,";
            }
            if(ch2.isChecked)
            {
                str += ch2.text.toString() + " ,";
            }
            if(ch3.isChecked)
            {
                str += ch3.text.toString() + " ,";
            }

            str = str.trimEnd(',');

            tv1.setText(str);

            str = "";
        }
    }
}