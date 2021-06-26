package com.example.apitutorial.retrofit


import com.example.apitutorial.utils.API
import com.google.gson.JsonElement
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IRetrofit {


    // http://www.unsplash.com/search/photos/?query = ""   ""의 값은 searchTerm에 들어온 매개변수
    @GET(API.SEARCH_PHOTO)
    fun searchPhotos(@Query("query")
                     searchTerm: String) : Call<JsonElement>

    @GET(API.SEARCH_USERS)
    fun searchUsers(@Query("query") searchTerm: String) : Call<JsonElement>

}