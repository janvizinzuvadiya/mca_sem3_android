package com.example.database_demo

import android.database.Cursor
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_display)


        val ls = ArrayList<String>();

        val list : ListView = findViewById(R.id.list);
        val db = openOrCreateDatabase("mydb",MODE_PRIVATE,null);
        val cursor : Cursor = db.rawQuery("select * from user",null);

        if(cursor.count == 0)
        {
            Toast.makeText(this, "No Records Found !" , Toast.LENGTH_LONG).show();
        }
        else
        {
            while(cursor.moveToNext())
            {
                val id = cursor.getInt(0);
                val nm = cursor.getString(1);
                val lnm = cursor.getString(2);
                val city = cursor.getString(3);
                val gen = cursor.getString(4);

                val values = "${id} ${nm} ${lnm} ${city} ${gen}";

                ls.add(values);

            }
            cursor.close();
        }

        val adp = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,ls);
        list.adapter = adp;

    }
}