package com.example.bissmillah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FormProses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form_proses)

        val Email = intent.getStringExtra("Email")
        val Pwd = intent.getStringExtra("Pwd")

        val txtEmail:TextView = findViewById(R.id.txtEmail)
        val txtPwd:TextView = findViewById(R.id.txtPwd)
        txtEmail.text = "Email adalah : ${Email}"
        txtPwd.text = "Kata sandi anda : ${Pwd}"
    }
}