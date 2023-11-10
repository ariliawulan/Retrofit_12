package com.example.retrofit_12.model

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("results")
    val result: Int,
    @SerializedName("employee_name")
    val employeeName: String,
    @SerializedName("employee_salary")
    val employeeSalary: Int,
    @SerializedName("employee_age")
    val employeeAge: Int,
    @SerializedName("profile_image")
    val profileImage: String
)

