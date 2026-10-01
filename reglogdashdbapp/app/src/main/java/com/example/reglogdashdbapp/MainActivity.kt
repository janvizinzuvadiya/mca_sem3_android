package com.example.reglogdashdbapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        val con = openOrCreateDatabase("appdb",MODE_PRIVATE,null);
        con.execSQL("CREATE TABLE  IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT,username VARCHAR ,email VARHCAR)");


        val btn = findViewById<Button>(R.id.button);
        val ed1 = findViewById<EditText>(R.id.editTextText2);
        val ed2 = findViewById<EditText>(R.id.editTextText3);

        btn.setOnClickListener {
            con.execSQL("INSERT INTO users  (username, email)  VALUES (?,?)", arrayOf(ed1.text.toString(), ed2.text.toString()));
//            Toast.makeText(this, "User Registered !", Toast.LENGTH_LONG).show();


            val intent = Intent(this, loginpage::class.java);
            startActivity(intent);

        }


    }
}