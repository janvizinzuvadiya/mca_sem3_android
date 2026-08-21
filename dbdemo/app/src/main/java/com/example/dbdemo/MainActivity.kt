package com.example.dbdemo

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.security.interfaces.EdECKey


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        val con = openOrCreateDatabase("android_db",MODE_PRIVATE,null);
//        con.execSQL("CREATE TABLE IF NOT EXISTs Books (id int,name varchar)");

        var fnm : EditText = findViewById(R.id.editTextText4);
        var lnm : EditText = findViewById(R.id.editTextText5);
        var age : EditText = findViewById(R.id.editTextText6);

        var gen = findViewById<RadioGroup>(R.id.rdg);

        var city : Spinner = findViewById(R.id.spinner);

            val citties = arrayOf("Rajkot", "Ahmedabad" , "Surat" , "Broda", "Belhi", "Mumbai");
            val adp = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item , citties);

        city.adapter = adp;

        var btn : Button = findViewById(R.id.button);

        btn.setOnClickListener {
            val ct = city.selectedItem.toString()

            var selid = gen.checkedRadioButtonId;
            var genvalue = findViewById<RadioButton>(selid).text;

            Toast.makeText(this,"${fnm.text.toString()} ${lnm.text.toString()} ${age.text.toString()} ${ct} ${genvalue}", Toast.LENGTH_LONG ).show();
        }



    }
}