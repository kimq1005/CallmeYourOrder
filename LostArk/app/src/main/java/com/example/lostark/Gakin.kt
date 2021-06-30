package com.example.lostark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_gakin.*



class Gakin : AppCompatActivity() {

    var GakinType = arrayOf("증가 각인 선택", "--직업각인--", "디스트로이어 : 분노의 망치", "디스트로이어 : 중력 수련", "워로드 : 고독한 기사", "워로드 : 전투 태세",
            "버서커 : 광기",
            "버서커 : 광전사의 비기",
            "배틀마스터 : 오의 강화",
            "배틀마스터 : 초심",
            "인파이터 : 극의 체술",
            "인파이터 : 충격 단련",
            "기공사 : 새맥타통",
            "기공사 : 역천지체",
        "데빌헌터 : 핸드거너",
        "데빌헌터 : 연속 포격",
                "블래스터 : 연속 포격",
                "블래스터 : 화력 강화",
                "호크아이 : 두 번째 동료",
                "호크아이 : 두 번째 동료",
                "바드 : 진실된 용맹",
                "바드 : 절실한 구원",
                "서머너 : 넘치는 교감",
                "서머너 : 상급 소환사",
                "아르카나 : 황제의 칙령",
                "아르카나 : 황후의 은총",
                "창술사 : 절정",
                "창술사 : 절제",
        "블레이드 : 버스트",
        "블레이드 : 잔재된 기운",
                "데모닉 : 완벽한 억제",
                "데모닉 : 멈출 수 없는 충동",
                "홀리나이트 : 심판자",
                "홀리나이트 : 축복의 노라",
                "스카우터 : 아르데타인의 기술",
                "스카우터 : 진화의 유산",
                "리퍼 : 갈증",
                "리퍼 : 달의 소리",
                "건슬링어 : 사냥의 시간",
                "건슬링어 : 피스메이커",
                "스트라이커: 일격필살",
        "스트라이커: 오의난무",
        "--전투 각인--",
        "각성",
               "강령술",
                "강화 방패",
                "결투의 대가",
                "구슬동자",
                "굳은 의지",
                "급소 타격",
                "기습의 대가",
                "달인의 저력",
                "돌격 대장",
                "마나 회복 증가",
                "마나의 흐름",
                "바리케이드",
                "번개의 분노",
                "부러진 뼈",
                "분쇄의 주먹",
                "불굴",
                "선수필승",
                "슈퍼 차지",
                "승부사",
                "실드 관통",
                "안정된 상태",
                "약자 무시",
                "에테르 강화",
                "여신의 가호",
                "예리한 둔기",
                "원한",
                "위기 모면",
                "저주받은 인형",
                "정기 흡수",
                "중갑 착용",
                "최대 마나 증가",
                "탈출의 명수",
                "폭팔물 전문가")

    var GakinFight = arrayOf("--전투 각인--",
            "각성",
            "강령술",
            "강화 방패",
            "결투의 대가",
            "구슬동자",
            "굳은 의지",
            "급소 타격",
            "기습의 대가",
            "달인의 저력",
            "돌격 대장",
            "마나 회복 증가",
            "마나의 흐름",
            "바리케이드",
            "번개의 분노",
            "부러진 뼈",
            "분쇄의 주먹",
            "불굴",
            "선수필승",
            "슈퍼 차지",
            "승부사",
            "실드 관통",
            "안정된 상태",
            "약자 무시",
            "에테르 강화",
            "여신의 가호",
            "예리한 둔기",
            "원한",
            "위기 모면",
            "저주받은 인형",
            "정기 흡수",
            "중갑 착용",
            "최대 마나 증가",
            "탈출의 명수",
            "폭팔물 전문가")
    var GakinMinus = arrayOf("--감소 각인 선택--","공격력 감소","공격 속도 감소", "방어력 감소", "이동속도 감소")


    var GakinPoint= arrayOf(0,1,2,3,4,5,6,7,8,9)




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gakin)

        val GakinTypeadapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,GakinType)    //전투직업 각인 아답터 생성
        val AblityGakinTypeadapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,GakinFight)    //어빌리티 전투 각인 아답터 생성
        val GakinMinusadapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,GakinMinus)  //감소 각인 선택 , "공격력 감소"


        val GakinPointadapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,GakinPoint)  //어빌리티 감소 각인 (0~9)
        val GakinPointadapter2 = ArrayAdapter(this,android.R.layout.simple_spinner_item,GakinPoint)  //어빌리티 감소 각인 (0~9)






        GakinTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        AblityGakinTypeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        GakinMinusadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)


        GakinPointadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        GakinPointadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        /**어빌리티 스톤**/
        ablity_spinner1.adapter = AblityGakinTypeadapter
        ablity_point1.adapter = GakinPointadapter

        ablity_spinner2.adapter = AblityGakinTypeadapter
        ablity_point2.adapter = GakinPointadapter

        ablity_Minus.adapter = GakinMinusadapter
        ablity_Minus_Point.adapter = GakinPointadapter





        /** 목걸이 **/
        Neckspinner1.adapter =  GakinTypeadapter
        NeckPoint1.adapter = GakinPointadapter

        Neckspinner2.adapter = GakinTypeadapter
        NeckPoint2.adapter = GakinPointadapter2

        Neck_Minus_spinner1.adapter = GakinMinusadapter
        Neck_Minus_Point1.adapter = GakinPointadapter


        /** 귀걸이 1**/

        EarRing_spinner1.adapter =  GakinTypeadapter
        EarRing_Point1.adapter = GakinPointadapter

        EarRing_spinner2.adapter = GakinTypeadapter
        EarRing_Point2.adapter = GakinPointadapter

        EarRing_Minus_spinner1.adapter = GakinMinusadapter
        EarRing_Minus_Point1.adapter = GakinPointadapter


        /** 귀걸이 2**/

        EarRing_spinner3.adapter =  GakinTypeadapter
        EarRing_Point3.adapter = GakinPointadapter

        EarRing_spinner4.adapter = GakinTypeadapter
        EarRing_Point4.adapter = GakinPointadapter

        EarRing_Minus_spinner2.adapter = GakinMinusadapter
        EarRing_Minus_Point2.adapter = GakinPointadapter




        /** 반지 1 **/

        Ring_spinner1.adapter =  GakinTypeadapter
        Ring_Point1.adapter = GakinPointadapter

        Ring_spinner2.adapter = GakinTypeadapter
        Ring_Point2.adapter = GakinPointadapter

        Ring_Minus_spinner1.adapter = GakinMinusadapter
        Ring_Minus_Point1.adapter = GakinPointadapter

        /** 반지 2 **/

        Ring_spinner3.adapter =  GakinTypeadapter
        Ring_Point3.adapter = GakinPointadapter

        Ring_spinner4.adapter = GakinTypeadapter
        Ring_Point4.adapter = GakinPointadapter

        Ring_Minus_spinner2.adapter = GakinMinusadapter
        Ring_Minus_Point2.adapter = GakinPointadapter


//        Test1.visibility=View.INVISIBLE
//        Test2.visibility=View.INVISIBLE





        /**스피너 선언**/
        var listener = SpinnerListener();

        /** 목걸이 각인 결과창에 결과 띄우기 **/
        Neckspinner1.onItemSelectedListener = listener
        Neckspinner2.onItemSelectedListener = listener
        Neck_Minus_spinner1.onItemSelectedListener = listener

        NeckPoint1.onItemSelectedListener= listener
        NeckPoint2.onItemSelectedListener= listener
        Neck_Minus_Point1.onItemSelectedListener = listener




        /** 귀걸이1 각인 결과창에 띄우기 **/
        EarRing_spinner1.onItemSelectedListener = listener
        EarRing_spinner2.onItemSelectedListener = listener
        EarRing_Minus_spinner1.onItemSelectedListener = listener


        EarRing_Point1.onItemSelectedListener= listener
        EarRing_Point2.onItemSelectedListener= listener
        EarRing_Minus_Point1.onItemSelectedListener = listener


        /** 귀걸이2 각인 결과창에 띄우기 **/
        EarRing_spinner3.onItemSelectedListener = listener
        EarRing_spinner4.onItemSelectedListener = listener
        EarRing_Minus_spinner2.onItemSelectedListener = listener


        EarRing_Point3.onItemSelectedListener= listener
        EarRing_Point4.onItemSelectedListener= listener
        EarRing_Minus_Point2.onItemSelectedListener = listener


        /** 반지1 각인 결과 창에 띄우기**/
        Ring_spinner1.onItemSelectedListener = listener
        Ring_spinner2.onItemSelectedListener = listener
        Ring_Minus_spinner1.onItemSelectedListener = listener


        Ring_Point1.onItemSelectedListener= listener
        Ring_Point2.onItemSelectedListener= listener
        Ring_Minus_Point1.onItemSelectedListener = listener

        /** 반지2 각인 결과 창에 띄우기**/
        Ring_spinner3.onItemSelectedListener = listener
        Ring_spinner4.onItemSelectedListener = listener
        Ring_Minus_spinner1.onItemSelectedListener = listener


        Ring_Point3.onItemSelectedListener= listener
        Ring_Point4.onItemSelectedListener= listener
        Ring_Minus_Point2.onItemSelectedListener = listener

//        LinearSecond.visibility=View.INVISIBLE
        LinearThird.visibility=View.INVISIBLE



    }

    /** 스피너 값 Edit에 띄우기 **/
    inner class SpinnerListener : AdapterView.OnItemSelectedListener{
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            Neck()
//            var sum : Int = spinnerpoint1+spinnerpoint2


//            if(Neckspinner1==Neckspinner2){ // Neckspinner1과 Neckpinner2가 같으면 (ex.디트 분망 , 디트 분망 선택)
//                Test1.visibility=View.INVISIBLE
//                ResultName.text = Neckspinner1
//                ResultPoint.text = sum.toString()
//            }else if(Neckspinner1 !=Neckspinner2){  //spinner1과 spinner이 같지 않을때 (ex 디트 분망, 각성)
//                Test1.visibility=View.VISIBLE
//                ResultName2.text= Neckspinner2
//                ResultPoint2.text = spinnerpoint2.toString()
//            }
//
//
//            ResultName3.text= spinner3
//            ResultPoint3.text = spinnerpoint3.toString()





            /**귀걸이 스피너 함수 생성**/

//            var Earspinner1 = GakinType[EarRing_spinner1.selectedItemPosition] //Neckspinner1을 선택한 것
//            var Earspinner2 = GakinType[EarRing_spinner2.selectedItemPosition] //Neckspinner2를 선택한 것
//            var Earspinner3 = GakinType[EarRing_spinner3.selectedItemPosition] //Neckspinner1을 선택한 것
//            var Earspinner4 = GakinType[EarRing_spinner4.selectedItemPosition] //Neckspinner2를 선택한 것
//            var EarMinusspinner = GakinMinus[EarRing_Minus_spinner1.selectedItemPosition]
//
//            var Earspinnerpoint1 = GakinPoint[EarRing_Point1.selectedItemPosition] //Neckpoint1를 선택한 것
//            var Earspinnerpoint2 = GakinPoint[EarRing_Point2.selectedItemPosition] //Neckpoint2를 선택한 것
//            var Earspinnerpoint3 = GakinPoint[EarRing_Point3.selectedItemPosition] //Neckpoint1를 선택한 것
//            var Earspinnerpoint4 = GakinPoint[EarRing_Point4.selectedItemPosition] //Neckpoint2를 선택한 것
//
//            var EarMinuspoint = GakinPoint[EarRing_Minus_Point1.selectedItemPosition]



//            ResultName.text = Neckspinner1
//            ResultPoint.text = spinnerpoint1.toString()
//            var sum : Int = spinnerpoint1+spinnerpoint2
//
//
//            if(Neckspinner1==Neckspinner2){ // Neckspinner1과 Neckpinner2가 같으면 (ex.디트 분망 , 디트 분망 선택)
//                Test1.visibility=View.INVISIBLE
//                ResultName.text = Neckspinner1
//                ResultPoint.text = sum.toString()
//            }else if(Neckspinner1 !=Neckspinner2){  //spinner1과 spinner이 같지 않을때 (ex 디트 분망, 각성)
//                Test1.visibility=View.VISIBLE
//                ResultName2.text= Neckspinner2
//                ResultPoint2.text = spinnerpoint2.toString()
//            }
//
//            Test2.visibility=View.VISIBLE
//            ResultName3.text= spinner3
//            ResultPoint3.text = spinnerpoint3.toString()


        }


        override fun onNothingSelected(parent: AdapterView<*>?) {

        }

        
        private fun Neck() {
            /**목걸이**/
            var Neckspinner1 = GakinType[Neckspinner1.selectedItemPosition] //Neckspinner1을 선택한 것
            var Neckspinner2 = GakinType[Neckspinner2.selectedItemPosition] //Neckspinner2를 선택한 것
            var Neckspinner3 = GakinMinus[Neck_Minus_spinner1.selectedItemPosition]

            var Neck_spinnerpoint1 = GakinPoint[NeckPoint1.selectedItemPosition] //Neckpoint1를 선택한 것
            var Neck_spinnerpoint2 = GakinPoint[NeckPoint2.selectedItemPosition] //Neckpoint2를 선택한 것
            var Neck_spinnerpoint3 = GakinPoint[Neck_Minus_Point1.selectedItemPosition]

            var idont:String = "아 시발 진짜 개줫같네 "
            //



            ResultName1.text = Neckspinner1
            ResultPoint1.text = Neck_spinnerpoint1.toString()

            ResultName2.text = Neckspinner2
            ResultPoint2.text = Neck_spinnerpoint2.toString()

            ResultName3.text = Neckspinner3
            ResultPoint3.text = Neck_spinnerpoint3.toString()

            var Necksum:Int=Neck_spinnerpoint1+Neck_spinnerpoint2
            var Necksu2:String="뭐를 해봐야 하나 진짜 모르겠네요ㅠ_ㅠ"

            //엿같네 Sifut


            //2중 if문?


            /** 귀걸이 **/
            var EarRingspinner1 = GakinType[EarRing_spinner1.selectedItemPosition] //Neckspinner1을 선택한 것
            var EarRingspinner2 = GakinType[EarRing_spinner2.selectedItemPosition] //Neckspinner2를 선택한 것
            var EarRingspinner3 = GakinMinus[EarRing_Minus_spinner1.selectedItemPosition]

            var EarRing_spinnerpoint1 = GakinPoint[EarRing_Point1.selectedItemPosition] //Neckpoint1를 선택한 것
            var EarRing_spinnerpoint2 = GakinPoint[EarRing_Point2.selectedItemPosition] //Neckpoint2를 선택한 것
            var EarRing_spinnerpoint3 = GakinPoint[EarRing_Minus_Point1.selectedItemPosition]


            var Secondsum:Int= Neck_spinnerpoint2+EarRing_spinnerpoint2


//            if(Neckspinner1==Neckspinner2){
//                ResultPoint1.text = Necksum.toString()
//                LinearSecond.visibility=View.INVISIBLE
//                if(ResultName1.text==EarRingspinner1){  //ResultPoint1
//                    ResultPoint1.text=(Necksum+EarRing_spinnerpoint1).toString()
//                }
//            }else{
//                LinearSecond.visibility=View.VISIBLE
//            }









//            var Necksum:Int=spinnerpoint1+spinnerpoint2

//            ResultName1.text = Neckspinner1
//            ResultPoint1.text = spinnerpoint1.toString()
//
//            ResultName2.text = Neckspinner2
//            ResultPoint2.text = spinnerpoint2.toString()
//
//            ResultName3.text = Neckspinner3
//            ResultPoint3.text = spinnerpoint3.toString()


            /*********************************************************************************/

//            if(Neckspinner1==Neckspinner2){
//                ResultName1.text = Neckspinner1
//                ResultPoint1.text=Necksum.toString()
//            }


        }

    }


}



