package com.example.jetpack_android_2023.http

import org.json.JSONArray
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @PrjectName jetpack_android_2023
 * @Describe 描述
 * @Author chendong
 * @CreateTime 2024/10/9 21:38
 **/
interface IApiInterface {

    @GET("feeds/queryHotFeedsList")
    suspend fun getFeeds(@Query("feedId") feedId: Long = 0): ApiResult<JSONArray>
}