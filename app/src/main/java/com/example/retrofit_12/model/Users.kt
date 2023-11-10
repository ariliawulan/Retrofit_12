package com.example.retrofit_12.model

import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("results")
    val data: List<Data>
)
