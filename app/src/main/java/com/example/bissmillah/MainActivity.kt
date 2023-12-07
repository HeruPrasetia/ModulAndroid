package com.example.bissmillah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonShowToast: Button = findViewById(R.id.btnToast)

        // Menambahkan listener ke tombol untuk menanggapi klik
        buttonShowToast.setOnClickListener(View.OnClickListener {
            // Menampilkan toast ketika tombol diklik
            showToast("Hello, this is a toast!")
        })

        val btnPindahAktivity: Button = findViewById(R.id.btnPindahActivity)

        // Menambahkan listener ke tombol untuk pindah ke SecondActivity
        btnPindahAktivity.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, FormInput::class.java)
            startActivity(intent)
        })

        val btnLoopData : Button = findViewById(R.id.btnLoopData)

        btnLoopData.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, DataLoop::class.java)
            startActivity(intent)
        })
    }

    private fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}