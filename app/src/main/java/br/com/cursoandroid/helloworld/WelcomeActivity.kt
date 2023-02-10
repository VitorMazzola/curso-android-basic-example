package br.com.cursoandroid.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class WelcomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_name)

        initView()
    }

    private fun initView() {
        val buttonSayHello = findViewById<Button>(R.id.btSayHello)
        val editTextName = findViewById<TextInputEditText>(R.id.etName)
        val tvWelcomeName = findViewById<TextView>(R.id.tvWelcomeName)

        buttonSayHello.setOnClickListener {
            val name = editTextName.text.toString()
            tvWelcomeName.text = "Olá, $name"
        }
    }

}