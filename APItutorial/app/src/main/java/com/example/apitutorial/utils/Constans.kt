package com.example.apitutorial.utils

object Constans{
    const val TAG : String = "로그"
}

enum class SEARCH_TYPE{
    PHOTO,
    USER
}

enum class RESPONSE_STATE{
    OKAY,
    FAIL
}

object API {
    const val BASE_URL : String = "https://api.unsplash.com/"
    const val CLIENT_ID : String = "l4MOU0EpHYvh3KAAR6JWfDGfM_WbdhoXnBa7MrXpdR4"
    const val SEARCH_PHOTO: String = "search/photos"
    const val SEARCH_USERS: String = "search/users"
}