package com.example.jetpack_android_2023.http

/**
 * @PrjectName jetpack_android_2023
 * @Describe 描述
 * @Author chendong
 * @CreateTime 2024/10/9 21:37
 **/
class ApiResult<T> {
    var status = 0
    var errMsg = ""
    var body: T? = null
}