package com.example.database_demo

import android.app.appsearch.StorageInfo
import android.content.Intent
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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main);

        val fnm : EditText = findViewById(R.id.editTextText4);
        val lnm : EditText = findViewById(R.id.editTextText5);
//        val age : EditText = findViewById(R.id.editTextText6);
        val sp : Spinner = findViewById(R.id.spinner2);
        val gen : RadioGroup = findViewById(R.id.rg1);
        val btn : Button = findViewById(R.id.button2);

        val city = arrayOf("Ahmedabad","Broda","Rajkot");
        val adp = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,city);
        sp.adapter = adp;

        btn.setOnClickListener {

            //        Spinner

            val selcity = sp.selectedItem.toString();

            //        Radio Button

            val selid = gen.checkedRadioButtonId
            val selgen : String = findViewById<RadioButton>(selid).text.toString()

            val db = openOrCreateDatabase("mydb",MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS user ( id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,lnm TEXT, city TEXT, gender TEXT)");
            db.execSQL("INSERT INTO user (name, lnm, city, gender) VALUES (?, ?, ?, ?)",arrayOf(fnm.text.toString(),lnm.text.toString(),selcity,selgen));

            Toast.makeText(this,"You have Registered Successfully!!!", Toast.LENGTH_LONG).show();

            val intent = Intent(this, DisplayActivity::class.java);
            startActivity(intent)
        }

    }
}