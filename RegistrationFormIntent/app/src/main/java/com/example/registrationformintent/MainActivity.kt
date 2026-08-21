package com.example.registrationformintent

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var name : EditText = findViewById(R.id.editTextText3);
        var pass : EditText = findViewById(R.id.editTextText4);

        var gen : RadioGroup = findViewById(R.id.radiog);

        var hob1 : CheckBox = findViewById(R.id.checkBox);
        var hob2 : CheckBox = findViewById(R.id.checkBox2);

        var btn : Button = findViewById(R.id.button);


        btn.setOnClickListener {
            var nm = name.text.toString();
            var ps = pass.text.toString();

            var gd = gen.checkedRadioButtonId
            var gender =""
            if(gd!= -1)
                gender = findViewById<RadioButton>(gd).text.toString()

            var hobby = "";
            if(hob1.isChecked)
                hobby+= " ${hob1.text.toString()}"
            if(hob2.isChecked)
                hobby+= " ${hob2.text.toString()}"

            val intent = Intent();



        }

    }
}