package com.example.kotlinprogram

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("products")
    fun getdata():Call<List<Rmodel>>
}