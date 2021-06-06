package com.example.my_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val input_num1 = findViewById<EditText>(R.id.n1)
        val input_num2 = findViewById<EditText>(R.id.n2)
        val btn = findViewById<Button>(R.id.button2)
        val spinner = findViewById<Spinner>(R.id.op)
        val result = findViewById<TextView>(R.id.textView2)
        btn.setOnClickListener(View.OnClickListener {
            var num1 = input_num1.text.toString().toInt()
            var num2 = input_num2.text.toString().toInt()
            var res = ""
            var operator:String = spinner.selectedItem.toString()
            when(operator){
                "+" -> res = "${add(num1,num2)}"
                "-" -> res = "${sub(num1,num2)}"
                "x" -> res = "${mul(num1,num2)}"
                "/" -> res = "${div(num1,num2)}"
            }
            result.text = res
        })

    }
    fun add(a:Int,b:Int):Int{
        return a+b;
    }
    fun sub(a:Int,b:Int):Int{
        return a-b;
    }
    fun mul(a:Int,b:Int):Int{
        return a*b;
    }
    fun div(a:Int,b:Int):Int{
        return a/b;
    }
}