package com.example.weatherapphiltretrobersyte.model


import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("description")
    val description: String?,
    @SerializedName("forecast")
    val forecast: List<Forecast?>,
    @SerializedName("temperature")
    val temperature: String?,
    @SerializedName("wind")
    val wind: String?
)