package com.example.apptiempo.data.model


import com.squareup.moshi.Json

data class Wind(
    @field:Json(name = "deg")
    val deg: Int?,
    @field:Json(name = "gust")
    val gust: Double?,
    @field:Json(name = "speed")
    val speed: Double?
)