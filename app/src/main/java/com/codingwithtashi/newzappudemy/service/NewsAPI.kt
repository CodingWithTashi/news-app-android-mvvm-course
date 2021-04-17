package com.codingwithtashi.newzappudemy.service

import com.codingwithtashi.newzappudemy.util.Constant.Companion.APIKEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    @GET("everything")
    suspend fun getBusinesssNews(
            @Query("q")
            searchCategory:String,
            @Query("apiKey")
            apiKey:String = APIKEY
    ): Response<NewsResponse>
}