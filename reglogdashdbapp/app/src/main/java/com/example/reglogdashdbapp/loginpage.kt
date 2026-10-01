package com.example.reglogdashdbapp

import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loginpage)

        val con = openOrCreateDatabase("appdb",MODE_PRIVATE,null);

        val btn = findViewById<Button>(R.id.button2);
        val ed1 = findViewById<EditText>(R.id.editTextText);
        val ed2 = findViewById<EditText>(R.id.editTextText4);

        btn.setOnClickListener {

            val cur  = con.rawQuery("select COUNT(*) from users where username=? and email=?",arrayOf(ed1.text.toString(),ed2.text.toString()));

            if(cur.count > 0)
            {
                val intent = Intent(this, dahsboard::class.java).apply {
                    putExtra("unm" , ed1.text.toString());
                };
                startActivity(intent);
            }
            else
            {
                Toast.makeText(this,"User DOES NOT EXIST!", Toast.LENGTH_LONG).show();
            }


        }


    }
}