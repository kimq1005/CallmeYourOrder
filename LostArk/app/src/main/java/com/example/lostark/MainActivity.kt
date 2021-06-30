package com.example.lostark

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_week_contents.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()


        savebtn.setOnClickListener {
            saveData()

        }

        weekbtn.setOnClickListener {
            val intent = Intent(this,WeekContents::class.java)
            startActivity(intent)
        }

        resetbtn.setOnClickListener {
            one.isChecked = false
            two.isChecked = false
            three.isChecked = false
            four.isChecked = false
            five.isChecked = false
            six.isChecked = false
            seven.isChecked = false
            eight.isChecked = false
            nine.isChecked = false

            Toast.makeText(applicationContext,"리셋!",Toast.LENGTH_SHORT).show()

        }
    }



    //private은 클래스 내부에서만 사용하니까 해준 거
    private fun loadData() {
        val pref = getSharedPreferences("pref",0)

        Classname1.setText(pref.getString("classname1",""))
        Classname2.setText(pref.getString("classname2",""))
        Classname3.setText(pref.getString("classname3",""))


        one.setChecked(pref.getBoolean("one1",true))
        two.setChecked(pref.getBoolean("two1",true))
        three.setChecked(pref.getBoolean("three1",true))
        four.setChecked(pref.getBoolean("four1",true))
        five.setChecked(pref.getBoolean("five1",true))
        six.setChecked(pref.getBoolean("six1",true))
        seven.setChecked(pref.getBoolean("seven1",true))
        eight.setChecked(pref.getBoolean("eight1",true))
        nine.setChecked(pref.getBoolean("nine1",true))

        Toast.makeText(applicationContext,"로드 완료!",Toast.LENGTH_SHORT).show()
    }



    private fun saveData() {

        val pref = getSharedPreferences("pref",0)
        val edit = pref.edit()

        edit.putString("classname1",Classname1.text.toString())
        edit.putString("classname2",Classname2.text.toString())
        edit.putString("classname3",Classname3.text.toString())

        edit.putBoolean("one1",one.isChecked)
        edit.putBoolean("two1",two.isChecked)
        edit.putBoolean("three1",three.isChecked)
        edit.putBoolean("four1",four.isChecked)
        edit.putBoolean("five1",five.isChecked)
        edit.putBoolean("six1",six.isChecked)
        edit.putBoolean("seven1",seven.isChecked)
        edit.putBoolean("eight1",eight.isChecked)
        edit.putBoolean("nine1",nine.isChecked)

        edit.apply()


    }

//    private fun StringSaveData(){
//        val pref = getSharedPreferences("pref",0)
//        val edit = pref.edit()  //수정모드
//
//        edit.putString("name",Classname1.text.toString())
//        edit.putString("classname2",Classname2.text.toString())
//        edit.putString("classname3",Classname3.text.toString())
//
//        edit.apply()
//    }
//
//    private fun Stringload(){
//        val pref = getSharedPreferences("pref",0)
//
//        Classname1.setText(pref.getString("name",""))
//        Classname2.setText(pref.getString("Classname2",""))
//        Classname3.setText(pref.getString("Classname3",""))
//
//    }




    override fun onDestroy() {//앱이 종료되는 시점이 다가올 때 호출
        super.onDestroy()

        saveData()  //checkbox 값 저장

    }
}


