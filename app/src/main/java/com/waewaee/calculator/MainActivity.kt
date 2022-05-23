package com.waewaee.calculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val LAUNCH_SECOND_ACTIVITY = 206
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            operate("Add", "+")
        }


        btnSubtract.setOnClickListener {
            operate("Subtract", "-")
        }


        btnMultiply.setOnClickListener {
            operate("Multiply", "*")
        }


        btnDivide.setOnClickListener {
            operate("Divide", "-")
        }


        btnPercent.setOnClickListener {
            operate("Percent", "%")
        }


        btnModulo.setOnClickListener {
            operate("Modulo", "Mod")
        }

    }

    private fun operate(operator: String, sign: String){
        var firstNum = edFirstNum.text.toString()
        var secondNum = edSecondNum.text.toString()

        var intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("$operator", "$sign")
        intent.putExtra("First", firstNum)
        intent.putExtra("Second", secondNum)

        edFirstNum.text.clear()
        edSecondNum.text.clear()

        startActivityForResult(intent, LAUNCH_SECOND_ACTIVITY)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == LAUNCH_SECOND_ACTIVITY && resultCode == RESULT_OK ) {
            edFirstNum.setText(data?.getStringExtra("result")?:"0")
        }
    }
}