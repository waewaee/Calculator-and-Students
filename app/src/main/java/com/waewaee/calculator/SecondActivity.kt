package com.waewaee.calculator

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.math.round

class SecondActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var first = intent.getStringExtra("First")?.toDouble()?:0.0
        var second = intent.getStringExtra("Second")?.toDouble()?:0.0

        when {
            intent.hasExtra("Add") -> {
                tvResult.text = (first + second).toString()
            }

            intent.hasExtra("Subtract") -> {
                tvResult.text = (first - second).toString()
            }

            intent.hasExtra("Multiply") -> {
                tvResult.text = (first * second).toString()
            }

            intent.hasExtra("Divide") -> {
                tvResult.text = (first / second).toString()
            }

            intent.hasExtra("Percent") -> {
                tvResult.text = ((second/100)*first).toInt().toString()
            }

            intent.hasExtra("Modulo") -> {
                tvResult.text = (first % second).toString()
            }
        }

        btnMore.setOnClickListener {
            var returnIntent = Intent()
            returnIntent.putExtra("result", tvResult.text.toString())
            setResult(RESULT_OK, returnIntent)
            finish()
        }
    }

}