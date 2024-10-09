package com.example.jetpack_android_2023

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.jetpack_android_2023.http.ApiService
import kotlinx.coroutines.launch

/**
 * @PrjectName jetpack_android_2023
 * @Describe 描述
 * @Author chendong
 * @CreateTime 2024/10/9 21:44
 **/
class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {
            ApiService.getService().getFeeds(0)
        }
    }
}