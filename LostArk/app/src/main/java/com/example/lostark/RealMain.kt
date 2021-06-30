package com.example.lostark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lostark.악세각인효과.GoGakin
import kotlinx.android.synthetic.main.activity_real_main.*

class RealMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_real_main)


        GoEverybtn.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        GoGakIn.setOnClickListener {
            var Wbs:String = ""
            val intent = Intent(this, Gakin::class.java)
            startActivity(intent)
        }

    }

}