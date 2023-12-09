package com.example.bissmillah

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AppTasbih : AppCompatActivity() {
    var CT:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_tasbih)

        val btnTasbih : Button = findViewById(R.id.btnTasbih)
        val edtJumlah : TextView = findViewById(R.id.edtJumlah)

        btnTasbih.setOnClickListener(View.OnClickListener {
            val Jumlah:String = edtJumlah.text.toString()
            if(Jumlah == "") {
                CT++
                btnTasbih.text = CT.toString()
            }else{
                val Jml = Jumlah.toInt()
                if(Jml >= CT){
                    CT++
                    btnTasbih.text = CT.toString()
                }else{
                    btnTasbih.text = "Selesai ${CT.toString()}"
                }
            }
        })
    }
}