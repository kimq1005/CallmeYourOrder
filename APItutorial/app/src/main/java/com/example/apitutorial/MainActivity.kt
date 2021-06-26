package com.example.apitutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.apitutorial.retrofit.RetrofitManager
import com.example.apitutorial.utils.Constans.TAG
import com.example.apitutorial.utils.RESPONSE_STATE
import com.example.apitutorial.utils.SEARCH_TYPE
import com.example.apitutorial.utils.onMyTextChanged
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_button_search.*

class MainActivity : AppCompatActivity() {

    private var currentSearchType: SEARCH_TYPE = SEARCH_TYPE.PHOTO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: ")

        //라디오 그룹 가져오기
        search_term_raido_group.setOnCheckedChangeListener { _, checkedId ->

            // switch 문(when)
            when(checkedId){
                R.id.photo_search_radio_btn -> {
                    Log.d(TAG, "사진검색 버튼 클릭!")
                    search_term_text_layout.hint = "사진검색"
                    search_term_text_layout.startIconDrawable = resources.getDrawable(R.drawable.ic_baseline_photo_library_24)
                    this.currentSearchType = SEARCH_TYPE.PHOTO
                }

                R.id.user_search_radio_btn -> {
                    Log.d(TAG, "사용자검색 버튼 클릭!")
                    search_term_text_layout.hint = "사용자 검색"
                    search_term_text_layout.startIconDrawable = resources.getDrawable(R.drawable.ic_baseline_person_24)
                    this.currentSearchType = SEARCH_TYPE.USER
                }
            }
            Log.d(TAG, "체크돼었어 커런트서치톼입: $currentSearchType")
        }

        //텍스트가 변경이 되었을때
        search_term_edit_text.onMyTextChanged {

            if(it.toString().count()>0){

                //입력된 글자가 하나라도 있다면
                frame_search_btn.visibility = View.VISIBLE

                //스크롤뷰를 올린다
                main_scrollView.scrollTo(0,200)

            }else{
                frame_search_btn.visibility=View.INVISIBLE
                search_term_text_layout.helperText = "검색어를 입력해 주세요"
            }

            if(it.toString().count() == 12){
                Log.d(TAG, "에러 띄우기")
                Toast.makeText(this,"검색어는 12자 까지만 입력 가능합니다.",Toast.LENGTH_SHORT).show()
            }
        }

        btn_search.setOnClickListener{
            Log.d(TAG, "검색버튼이 클릭 되었어:$currentSearchType")

            val userSearchInput = search_term_edit_text.text.toString()

            // 검색 api 호출 ㅠ_ㅠ 어려워
            RetrofitManager.instance.searchPhotos(
                searchTerm = search_term_edit_text.text.toString(),
                completion = { responseState, responseDataArrayList ->

                    when (responseState) {
                        RESPONSE_STATE.OKAY -> {
                            Log.d(TAG, "api 호출 성공 ㅠ_ㅠ $responseDataArrayList.size")

                            val intent = Intent(this,PhotoCollectionActivity::class.java)
                            val bundle = Bundle()

                            bundle.putSerializable("photo_array_list",responseDataArrayList)
                            intent.putExtra("array_bundle",bundle)
                            intent.putExtra("search_term",userSearchInput)
                            startActivity(intent)
                        }

                        RESPONSE_STATE.FAIL -> {
                            Toast.makeText(this, "API 호출 에러요", Toast.LENGTH_SHORT).show()
                            Log.d(TAG, "api 호출 실패 ㅠ_ㅠ $responseDataArrayList")
                        }
                    }
                })
            this.handleSearchButtonUI()


        }
    }//onCreate

    private fun handleSearchButtonUI(){
        btn_progress.visibility = View.VISIBLE
        btn_search.text = ""

        Handler().postDelayed({
            btn_progress.visibility = View.INVISIBLE
            btn_search.text = "검색"
        },1500)
    }
}