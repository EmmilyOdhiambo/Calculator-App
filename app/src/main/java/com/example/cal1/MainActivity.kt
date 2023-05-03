package com.example.cal1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNumbers()
        substractionNumbers()
        remainderNumbers()
        multiplicationNumbers()
    }
    fun addNumbers(){
        var sumNum1=findViewById<EditText>(R.id.number1)
        var sumNum2=findViewById<EditText>(R.id.number2)
        var button1=findViewById<Button>(R.id.btn_add)
        button1.setOnClickListener {
            var addNum1=sumNum1.text.toString().toInt()
            var addNum2=sumNum2.text.toString().toInt()
            var answer=addNum1+addNum2
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }
    }
    fun remainderNumbers(){
        var remNum1=findViewById<EditText>(R.id.number1)
        var remNum2=findViewById<EditText>(R.id.number2)
        var button2=findViewById<Button>(R.id.btn_div)
        button2.setOnClickListener {
            var remNum1=remNum1.text.toString().toInt()
            var remNum2=remNum2.text.toString().toInt()
            var answer=remNum1%remNum2
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }
    }
    fun multiplicationNumbers(){
        var multiplyNum1=findViewById<EditText>(R.id.number1)
        var multiplyNum2=findViewById<EditText>(R.id.number2)
        var button3=findViewById<Button>(R.id.btn_div)
        button3.setOnClickListener {
            var multiplication1=multiplyNum1.text.toString().toInt()
            var multiplication2=multiplyNum2.text.toString().toInt()
            var answer=multiplication1*multiplication2
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }
    }
    fun substractionNumbers(){
        var substractNum1=findViewById<EditText>(R.id.number1)
        var substractNum2=findViewById<EditText>(R.id.number2)
        var button4=findViewById<Button>(R.id.btn_div)
        button4.setOnClickListener {
            var substraction1=substractNum1.text.toString().toInt()
            var substraction2=substractNum2.text.toString().toInt()
            var answer=substraction1-substraction2
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }
    }

}