package com.example.my_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input_radius = findViewById<EditText>(R.id.input_radius)
        var btn = findViewById<Button>(R.id.button)
        var txt = findViewById<TextView>(R.id.txt1)


        btn.setOnClickListener(View.OnClickListener {
            var radius = input_radius.text.toString().toDouble()
            val pi = 3.1415
            var area = pi*radius*radius
            txt.text = "area of circle is $area"
        })

    }
}