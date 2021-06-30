package com.example.lostark.악세각인효과

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.lostark.R
import com.google.android.material.internal.ContextUtils.getActivity
import kotlinx.android.synthetic.main.activity_go_gakin.*
import kotlinx.android.synthetic.main.neck_dialog.*

//class NeckDIalog(context: Context, GakinInterface:GakinInterface)
//    : Dialog(context),View.OnClickListener  {
//
//
////
////    private var GakinInterface:GakinInterface?=null
////
////    init{
////        this.GakinInterface = GakinInterface
////    }
//
//
//
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.neck_dialog)
////
//        var GakinTypeadapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, GakinType)    //전투직업 각인 아답터 생성
//        val AblityGakinTypeadapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, GakinFight)    //어빌리티 전투 각인 아답터 생성
//        val GakinMinusadapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, GakinMinus)  //감소 각인 선택 , "공격력 감소"
//
//
//        val GakinPointadapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, GakinPoint)  //어빌리티 감소 각인 (0~9)
//
//
//        GakinTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        AblityGakinTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        GakinMinusadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//
//
//        GakinPointadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//
//
//        NeckSaveBtn.setOnClickListener (this)
//
//
//        Neckspinner1.adapter =  GakinTypeadapter
//        NeckPoint1.adapter = GakinPointadapter
//
//        Neckspinner2.adapter = GakinTypeadapter
//        NeckPoint2.adapter = GakinPointadapter
//
//        Neck_Minus_spinner1.adapter = GakinMinusadapter
//        Neck_Minus_Point1.adapter = GakinPointadapter

//        var listener = SpinnerListener();
//        Neckspinner1.onItemSelectedListener = listener






//    }



    //배경 투명
//        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

//       NeckSaveBtn.setOnClickListener {
//           this.GakinInterface?.onNeckSaveBtn()
//        }





//    override fun onClick(view: View?) {
//       when(view){
//           NeckSaveBtn ->{
//               this.GakinInterface?.onNeckSaveBtn()
//
//
//           }
//       }
//    }




//    inner class SpinnerListener : AdapterView.OnItemSelectedListener{
//        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//
//            var Neckspinner1 = GakinType[Neckspinner1.selectedItemPosition]
//            var Neckspinner2 = GakinType[Neckspinner2.selectedItemPosition]
//            var spinner3 = GakinMinus[Neck_Minus_spinner1.selectedItemPosition]
//
//            var spinnerpoint1 = GakinPoint[NeckPoint1.selectedItemPosition]
//            var spinnerpoint2 = GakinPoint[NeckPoint2.selectedItemPosition]
//            var spinnerpoint3 = GakinPoint[Neck_Minus_Point1.selectedItemPosition]

//            ResultNeckName.text = Neckspinner1
//            NeckResultPoint1.text = spinnerpoint1.toString()





//        }
//
//        override fun onNothingSelected(parent: AdapterView<*>?) {
//
//        }
//
//    }






//}