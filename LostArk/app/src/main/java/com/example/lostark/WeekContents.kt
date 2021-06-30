package com.example.lostark

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.weekbtn
import kotlinx.android.synthetic.main.activity_week_contents.*

class WeekContents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week_contents)

        loaddata()


        backbutton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        weeksavebtn.setOnClickListener {
            savedata()
        }

        weekresetbtn.setOnClickListener {
            nakwonone.isChecked = false
            nakwontwo.isChecked = false
            nakwonthree.isChecked = false
            orehaone.isChecked = false
            orehatwo.isChecked = false
            orehathree.isChecked = false
            argosone.isChecked = false
            argostwo.isChecked = false
            argosthree.isChecked = false
            weekall.isChecked = false

            Toast.makeText(applicationContext,"리셋!",Toast.LENGTH_SHORT).show()
        }




         //저장되어 있던 값을 setText
    }



    private fun loaddata() {

        val pref = getSharedPreferences("pref",0)

        WeekClass1.setText(pref.getString("WeekC1",""))
        WeekClass2.setText(pref.getString("WeekC2",""))
        WeekClass3.setText(pref.getString("WeekC3",""))

        nakwonone.setChecked(pref.getBoolean("nakwonone",true))
        nakwontwo.setChecked(pref.getBoolean("nakwontwo",true))
        nakwonthree.setChecked(pref.getBoolean("nakwonthree",true))
        orehaone.setChecked(pref.getBoolean("orehaone",true))
        orehatwo.setChecked(pref.getBoolean("orehatwo",true))
        orehathree.setChecked(pref.getBoolean(" orehathree",true))
        argosone.setChecked(pref.getBoolean("argosone",true))
        argostwo.setChecked(pref.getBoolean("argostwo",true))
        argosthree.setChecked(pref.getBoolean("argosthree",true))
        weekall.setChecked(pref.getBoolean("weekall",true))

        Toast.makeText(applicationContext,"로드 완료!", Toast.LENGTH_SHORT).show()

    }

    private fun savedata() {

        val pref = getSharedPreferences("pref",0)
        val edit = pref.edit()

        edit.putString("WeekC1",WeekClass1.text.toString())
        edit.putString("WeekC2",WeekClass2.text.toString())
        edit.putString("WeekC3",WeekClass3.text.toString())

        edit.putBoolean("nakwonone",nakwonone.isChecked)
        edit.putBoolean("nakwontwo",nakwontwo.isChecked)
        edit.putBoolean("nakwonthree",nakwonthree.isChecked)
        edit.putBoolean("orehaone",orehaone.isChecked)
        edit.putBoolean("orehatwo",orehatwo.isChecked)
        edit.putBoolean("orehathree",orehathree.isChecked)
        edit.putBoolean("argosone",argosone.isChecked)
        edit.putBoolean("argostwo",argostwo.isChecked)
        edit.putBoolean("argosthree",argosthree.isChecked)
        edit.putBoolean("weekall",weekall.isChecked)

        edit.apply()

    }

    override fun onDestroy() {
        super.onDestroy()

        savedata()
    }


}