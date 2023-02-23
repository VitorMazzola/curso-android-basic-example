package br.com.cursoandroid.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NamesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_name)

        val recyclerNames = findViewById<RecyclerView>(R.id.rvNames)

        val nameAdapter = NameAdapter(this, MockData.getMockUsers())
        recyclerNames.adapter = nameAdapter
        recyclerNames.layoutManager = LinearLayoutManager(this)
    }
}