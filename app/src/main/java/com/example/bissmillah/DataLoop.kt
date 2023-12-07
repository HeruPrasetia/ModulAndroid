package com.example.bissmillah

import CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class DataLoop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data_loop)

        val gridView: GridView = findViewById(R.id.gridView)

        val data = listOf(
            mapOf("nama" to "heru", "telp" to "012345779772"),
            mapOf("nama" to "yuni", "telp" to "012345779772"),
            mapOf("nama" to "nayla", "telp" to "012345779772"),
            mapOf("nama" to "neira", "telp" to "012345779772")
        )

        val adapter = CustomAdapter(this, data)
        gridView.adapter = adapter
    }
}