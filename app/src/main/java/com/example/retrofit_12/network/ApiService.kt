package com.example.retrofit_12.network

import com.example.retrofit_12.model.ExampleModel
import com.example.retrofit_12.model.Users
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getRickCharacter(): Call<ExampleModel>
}