package com.example.magic.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    class PhoneRetrofitClient {
        companion object{
            private const val BASE_URL = "https://api.magicthegathering.io/v1/"

            /*var okHttpClient = OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build()

             */

            fun getRetrofitPhone() : MagicApi{
                val mRetrofit = Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build()
                return mRetrofit.create(MagicApi::class.java)
            }
        }
    }
}