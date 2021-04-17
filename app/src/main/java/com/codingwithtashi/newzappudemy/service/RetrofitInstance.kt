package com.codingwithtashi.newzappudemy.service

import com.codingwithtashi.newzappudemy.util.Constant.Companion.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitInstance {
    companion object {
        private val retrofit by lazy {
            val client = OkHttpClient.Builder()
                    .build();

            Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        val api by lazy {
            retrofit.create(NewsAPI::class.java);
        }
    }
}