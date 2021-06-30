package com.example.lostark.악세각인효과

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.lostark.R
import kotlinx.android.synthetic.main.activity_go_gakin.*
import kotlinx.android.synthetic.main.neck_dialog.*

class GoGakin : AppCompatActivity(),GakinInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_gakin)




    }



    //목걸이를 선택할시 다이얼 로그 띄어줌
//    fun NeckDialogBtnClicked(view:View){
//        val NeckDialog = NeckDIalog(this, this)
//        NeckDialog.show()
//    }
//
//
//
//
//
//    //여기에서 세이브 버튼을 누르면 각인 정보들이
//    override fun onNeckSaveBtn() {
//
//        Toast.makeText(this,"실험이다 십색기야", Toast.LENGTH_SHORT).show()
//    }

//    override fun onAblitystoneSaveBtn() {
//
//    }
//
//
//
//    override fun onEarRingSaveBtn_1() {
//
//    }
//
//    override fun onEarRingSaveBtn_2() {
//
//    }
//
//    override fun onRingSaveBtn_1() {
//
//    }
//
//    override fun onRingSaveBtn_2() {
//
//    }





}