package com.example.autocompletetextview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // -----------------------------------------

        var actv : AutoCompleteTextView = findViewById(R.id.actv1);

        var values = arrayOf("Apple", "Banana", "Cherry", "Dragon fruit", "Elderberry","Fig","Grape");

        var adp = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,values);
        actv.setAdapter(adp);
        actv.threshold = 1;

        // -------------------------------------------

        var spn : Spinner = findViewById(R.id.spinner);

        val city = arrayOf("Delhi","Mumbai","Ahmendabad","Newyork");

        val adp1 = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,city);
        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spn.adapter = adp1;






    }
}