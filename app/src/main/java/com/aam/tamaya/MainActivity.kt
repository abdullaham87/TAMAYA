package com.aam.tamaya

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btntahlilyasin: Button
    private lateinit var btnmaulid: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btntahlilyasin = findViewById(R.id.btn_yasin_tahlil)
        btntahlilyasin.setOnClickListener(this)

        btnmaulid = findViewById(R.id.btn_maulid)
        btnmaulid.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null ){
            when(v.id) {

                R.id.btn_yasin_tahlil -> run {
                    val intent= Intent(this, main_tahlil_yasin::class.java)
                    startActivity(intent)
                }
                R.id.btn_maulid -> run {
                    val intent= Intent(this,main_maulid::class.java)
                    startActivity(intent)
                }

            }
        }
    }
}