package com.example.my_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var button = findViewById<Button>(R.id.btn)
        var editText = findViewById<EditText>(R.id.text)
        var text = findViewById<TextView>(R.id.result)
        button.setOnClickListener{
            var str = ""
            var num = editText.text.toString()!!.toInt()
            for(i in 1..num){
                if(i==num){
                    str += "$i";
                }
                else{
                    str += "$i@";
                }
            }
            text.text = str;
        }
    }
}