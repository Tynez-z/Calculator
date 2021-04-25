package com.example.calculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var operator = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editFirst = findViewById<EditText>(R.id.editTextTextPersonName)
        val editSecond = findViewById<EditText>(R.id.editTextTextPersonName2)
        val textRes = findViewById<TextView>(R.id.textViewResult)
        val btnSumma = findViewById<Button>(R.id.button1)
        val btnMinus = findViewById<Button>(R.id.button2)
        val btnMultiply = findViewById<Button>(R.id.button3)
        val btnDiv = findViewById<Button>(R.id.button4)
        val btnResult = findViewById<Button>(R.id.button5)

        btnSumma.setOnClickListener {
            operator = "+"
        }

        btnMinus.setOnClickListener {
            operator = "-"
        }

        btnMultiply.setOnClickListener {
            operator = "*"
        }

        btnDiv.setOnClickListener {
            operator = "/"
        }

        btnResult.setOnClickListener {
            val input1 = editFirst.text.toString().toDouble()
            val input2 = editSecond.text.toString().toDouble()
            var result = 0.0
            if (operator.equals("+")) {
                result = input1.toDouble() + input2.toDouble()
            } else if (operator.equals("-")) {
                result = input1.toDouble() - input2.toDouble()
            } else if (operator.equals("*")) {
                result = input1.toDouble() * input2.toDouble()
            } else if (operator.equals("/")) {
                result = input1.toDouble() / input2.toDouble()
            }
            textRes.text = result.toString()
        }
    }
}

