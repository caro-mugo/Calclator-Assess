package com.carolinenyambura.mycalculator3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var etText1:TextInputEditText
    lateinit var etText2:TextInputEditText
    lateinit var tilText1:TextInputLayout
    lateinit var tilText2:TextInputLayout
    lateinit var tvResults:TextView
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivide:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etText1=findViewById(R.id.etText1)
        etText2=findViewById(R.id.etText2)
        tilText1=findViewById(R.id.tilText1)
        tilText2=findViewById(R.id.tilText2)
        tvResults=findViewById(R.id.tvResults)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnDivide=findViewById(R.id.btnDivide)

        btnAdd.setOnClickListener {
          var add=etText1.text.toString().toInt()
            var add2=etText2.text.toString().toInt()
            Addition(add,add2)

        }
        btnSubtract.setOnClickListener {
            var minus=etText1.text.toString().toInt()
            var minus2=etText2.text.toString().toInt()
            Subtraction(minus,minus2)

        }
        btnMultiply.setOnClickListener {
            var product=etText1.text.toString().toInt()
            var product2=etText2.text.toString().toInt()
            Multiplication(product,product2)
        }
        btnDivide.setOnClickListener {
            var remainder=etText1.text.toString().toInt()
            var remainder2=etText2.text.toString().toInt()
            Division(remainder,remainder2)
        }
    }
    fun Addition(add:Int,add2:Int){
        var sum=add + add2
        tvResults.text=sum.toString()

    }
    fun Subtraction(minus:Int,minus2:Int){
        var sub=minus - minus2
        tvResults.text=sub.toString()
    }
    fun Multiplication(product:Int,product2:Int){
        var mult=product * product2
        tvResults.text=mult.toString()
    }
    fun Division(remainder:Int,remainder2: Int){
        var div=remainder / remainder2
        tvResults.text=div.toString()
    }
}








