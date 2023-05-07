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
        subtractionNumbers()
        remainderNumbers()
        multiplicationNumbers()
    }
    fun addNumbers(){
        var sumNum1=findViewById<EditText>(R.id.number1)
        var sumNum2=findViewById<EditText>(R.id.number2)
        var button=findViewById<Button>(R.id.btn_add)
        button.setOnClickListener {
            var addNum1=sumNum1.text.toString().toInt()
            var addNum2=sumNum2.text.toString().toInt()
            var answer=addNum1+addNum2
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }
    }
    fun remainderNumbers(){
        var remNum1=findViewById<EditText>(R.id.number1)
        var remNum2=findViewById<EditText>(R.id.number2)
        var button=findViewById<Button>(R.id.btn_div)
        button.setOnClickListener {
            var remNum1=remNum1.text.toString().toInt()
            var remNum2=remNum2.text.toString().toInt()
            var answer=remNum1%remNum2
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }
    }
    fun multiplicationNumbers(){
        var multiplyNum1=findViewById<EditText>(R.id.number1)
        var multiplyNum2=findViewById<EditText>(R.id.number2)
        var button=findViewById<Button>(R.id.btn_mul)
        button.setOnClickListener {
            var multiplication1=multiplyNum1.text.toString().toInt()
            var multiplication2=multiplyNum2.text.toString().toInt()
            var answer=multiplication1*multiplication2
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }
    }
    fun subtractionNumbers(){
        var subtractNum1=findViewById<EditText>(R.id.number1)
        var subtractNum2=findViewById<EditText>(R.id.number2)
        var button=findViewById<Button>(R.id.btn_sub)
        button.setOnClickListener {
            var subtraction1=subtractNum1.text.toString().toInt()
            var subtraction2=subtractNum2.text.toString().toInt()
            var answer=subtraction1-subtraction2
            Toast.makeText(this,"$answer",Toast.LENGTH_SHORT).show()
        }
    }

}