package com.example.jetpack_android_2023.http

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @PrjectName jetpack_android_2023
 * @Describe 描述
 * @Author chendong
 * @CreateTime 2024/10/9 21:33
 **/
object ApiService {
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://127.0.0.1/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getService(): IApiInterface{
        return retrofit.create(IApiInterface::class.java)
    }
}