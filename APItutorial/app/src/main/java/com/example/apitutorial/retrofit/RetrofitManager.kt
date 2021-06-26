package com.example.apitutorial.retrofit

import android.util.Log
import com.example.apitutorial.model.Photo
import com.example.apitutorial.utils.API
import com.google.gson.JsonElement
import com.example.apitutorial.utils.Constans.TAG
import com.example.apitutorial.utils.RESPONSE_STATE
import retrofit2.Call
import retrofit2.Response
import java.text.SimpleDateFormat

class RetrofitManager {

    companion object{   //싱글턴이 적용되도록 object한거야
        val instance = RetrofitManager()
    }

    //http 콜 만들기
    //레트로핏 인터페이스 가져오기
    private val iRetrofit : IRetrofit? = RetrofitClient.getClient(API.BASE_URL)?.create(IRetrofit::class.java)
    
    //사진 검색 api 호출
    fun searchPhotos(searchTerm: String?, completion: (RESPONSE_STATE, ArrayList<Photo>?)-> Unit){
        val term = searchTerm.let{
            it
        }?:""

        //val term =searchTerm? : ""


        val call = iRetrofit?.searchPhotos(term).let {
            it  //it을 넣으면 call에 들어감 아시발 뭔개소리야 ㅡㅡ
        }?:return

//        val call = iRetrofit?.searchPhotos(searchTerm=term) ?:return

        call.enqueue(object : retrofit2.Callback<JsonElement> {

            override fun onFailure(call: Call<JsonElement>, t: Throwable) {
                Log.d(TAG, "onFailure: 응답실패")

                completion(RESPONSE_STATE.FAIL, null)

            }

            override fun onResponse(call: Call<JsonElement>, response: Response<JsonElement>) {
                Log.d(TAG, "onResponse: 응답성공: ${response.body()}")

                when (response.code()) {
                    200 -> {

                        response.body()?.let {


                            var parsedPhotoDateArray = ArrayList<Photo>()

                            val body = it.asJsonObject

                            val results = body.getAsJsonArray("results")

                            val total = body.get("total").asInt

                            Log.d(TAG, "토탈: $total")

                            results.forEach { resultItem ->
                                val resultItemObject = resultItem.asJsonObject
                                val user = resultItemObject.get("user").asJsonObject
                                val username: String = user.get("username").asString
                                val likesCount = resultItemObject.get("likes").asInt
                                val thumbnailLinks = resultItemObject.get("urls").asJsonObject.get("thumb").asString
                                val createAt = resultItemObject.get("created_at").asString
                                val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                                val formatter = SimpleDateFormat("yyyy년\nMM월 dd일")
                                val outputDateString = formatter.format(parser.parse(createAt))


                                val photoItem = Photo(
                                        author = username,
                                        likesCount = likesCount,
                                        thumbnail = thumbnailLinks,
                                        createdAt = outputDateString
                                )

                                parsedPhotoDateArray.add(photoItem)
                            }
                            completion(RESPONSE_STATE.OKAY, parsedPhotoDateArray)
                        }

                    }
                }

            }


        })


    }
}