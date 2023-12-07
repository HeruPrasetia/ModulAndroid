package com.example.bissmillah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class FormInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form_input)

        val btnBatal : Button = findViewById(R.id.btnBatal)
        val btnLogin : Button = findViewById(R.id.btnLogin)
        val edtEmail : TextView = findViewById(R.id.edtEmail)
        val edtPwd : TextView = findViewById(R.id.edtPassword)
        val tilEmail: TextInputLayout = findViewById(R.id.tilEmail)
        val tilPassword: TextInputLayout = findViewById(R.id.tilPassword)

        btnBatal.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@FormInput, MainActivity::class.java)
            startActivity(intent)
        })


        btnLogin.setOnClickListener(View.OnClickListener{
            val Email : String = edtEmail.text.toString()
            val Pwd : String = edtPwd.text.toString()
            if (Email.isNotEmpty() && Pwd.isNotEmpty()) {
                Toast.makeText(applicationContext, "Email adalah ${Email} Dan Password Adalah ${Pwd}", Toast.LENGTH_SHORT).show()
            } else {
                if (Email.isEmpty()) {
                    tilEmail.error = "Email harus diisi"
                } else {
                    tilEmail.error = null // Menghapus pesan kesalahan jika sudah diisi
                }

                if (Pwd.isEmpty()) {
                    tilPassword.error = "Password harus diisi"
                } else {
                    tilPassword.error = null // Menghapus pesan kesalahan jika sudah diisi
                }
            }
        })
    }
}