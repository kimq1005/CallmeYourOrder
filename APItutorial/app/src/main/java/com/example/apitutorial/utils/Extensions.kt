package com.example.apitutorial.utils

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText


// 문자열이 제이슨 형태인지, 제이슨 배열 형태인지
//fun String?.isJsonObject():Boolean{
//    if(this?.startsWith("{") == true && this.endsWith("}")){
//        return true
//    }else{
//        return false
//    }
//}


// 문자열이 제이슨 형태인지, 제이슨 배열 형태인지. 위랑 똑같은걸 축약한거임 근데 뭔 개소리인지 모르겟어 시발 진짜 ㅡㅡ
fun String?.isJsonObject():Boolean{
    return this?.startsWith("{") == true && this.endsWith("}")
}

//문자열이 제이슨 배열인지
fun String?.isJsonArray():Boolean{
    if(this?.startsWith("[") == true && this.endsWith("]")){
        return true
    }else{
        return false
    }
}





//에딧 텍스트에 대한 익스텐션

fun EditText.onMyTextChanged(completion:(Editable?)->Unit) {
    this.addTextChangedListener(object : TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        }

        override fun afterTextChanged(editable: Editable) {
            completion(editable)

        }

    })
}