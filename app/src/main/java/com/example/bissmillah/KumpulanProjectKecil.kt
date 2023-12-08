package com.example.bissmillah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class KumpulanProjectKecil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kumpulan_project_kecil)

        val cardTasbih:CardView = findViewById(R.id.cardTasbih)

        cardTasbih.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@KumpulanProjectKecil, AppTasbih::class.java)
            startActivity(intent)
        })
    }
}