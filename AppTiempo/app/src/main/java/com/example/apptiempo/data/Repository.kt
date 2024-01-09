package com.example.apptiempo.data

import com.example.apptiempo.data.network.RetrofitHelper

class Repository {

    private val apiService = RetrofitHelper.getRetrofit()

    suspend fun tiempo(lat:Double,lon:Double,appid:String,lang:String,units:String) = apiService.tiempo(lat,lon,appid,lang,units)

}