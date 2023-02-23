package br.com.cursoandroid.helloworld

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
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
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        numberA = findViewById<TextInputEditText>(R.id.etNumberOne)
        numberB = findViewById<TextInputEditText>(R.id.etNumberTwo)
        buttonSum = findViewById<Button>(R.id.btSum)
        tvResult = findViewById<TextView>(R.id.tvResult)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun calcular() {
        buttonSum.setOnClickListener {
            val firstNumber = numberA.text.toString()
            val secondNumber = numberB.text.toString()

            val sum = firstNumber.toInt() + secondNumber.toInt()
            tvResult.text = "O resultado da soma é: $sum"
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}