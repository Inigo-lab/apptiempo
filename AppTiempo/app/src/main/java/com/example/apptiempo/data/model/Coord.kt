package com.example.apptiempo.data.model


import com.squareup.moshi.Json

data class Coord(
    @field:Json(name = "lat")
    val lat: Double?,
    @field:Json(name = "lon")
    val lon: Double?
)