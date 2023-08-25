package com.example.magic.data.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MagicApi {

    @GET("cards")
    fun allCards(@Query("page") page: String): Call<Cards>
}