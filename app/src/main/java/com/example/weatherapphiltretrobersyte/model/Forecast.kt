package com.example.weatherapphiltretrobersyte.model


import com.google.gson.annotations.SerializedName

data class Forecast(
    @SerializedName("day")
    val day: Int?,
    @SerializedName("temperature")
    val temperature: String?,
    @SerializedName("wind")
    val wind: String?
)