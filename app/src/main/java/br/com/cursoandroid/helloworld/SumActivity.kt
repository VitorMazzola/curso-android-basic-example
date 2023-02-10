package br.com.cursoandroid.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class SumActivity: AppCompatActivity() {

    lateinit var numberA: TextInputEditText
    lateinit var numberB: TextInputEditText
    lateinit var buttonSum: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum)

        initView()
        calcular()
    }

    private fun initView() {
        numberA = findViewById<TextInputEditText>(R.id.etNumberOne)
        numberB = findViewById<TextInputEditText>(R.id.etNumberTwo)
        buttonSum = findViewById<Button>(R.id.btSum)
        tvResult = findViewById<TextView>(R.id.tvResult)
    }

    private fun calcular() {
        buttonSum.setOnClickListener {
            val firstNumber = numberA.text.toString()
            val secondNumber = numberB.text.toString()

            val sum = firstNumber.toInt() + secondNumber.toInt()
            tvResult.text = "O resultado da soma é: $sum"
        }
    }
}