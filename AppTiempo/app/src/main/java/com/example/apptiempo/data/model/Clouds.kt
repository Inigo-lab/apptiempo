package com.example.apptiempo.data.model


import com.squareup.moshi.Json

data class Clouds(
    @field:Json(name = "all")
    val all: Int?
)