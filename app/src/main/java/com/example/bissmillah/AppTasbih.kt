package com.example.bissmillah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class AppTasbih : AppCompatActivity() {
    var CT:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_tasbih)

        val btnTasbih : Button = findViewById(R.id.btnTasbih)
        val edtJumlah : TextView = findViewById(R.id.edtJumlah)
        val Jumlah:String = edtJumlah.text.toString()

        btnTasbih.setOnClickListener(View.OnClickListener {
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