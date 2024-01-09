package com.example.apptiempo.data.network

import com.example.apptiempo.data.model.Tiempo
import com.example.apptiempo.data.model.Weather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather")
    suspend fun tiempo(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") appid : String,
        @Query("lang") lang: String,
        @Query("units") units: String
    ): Response<Tiempo>

}