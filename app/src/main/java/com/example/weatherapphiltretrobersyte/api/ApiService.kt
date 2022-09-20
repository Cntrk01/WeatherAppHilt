package com.example.weatherapphiltretrobersyte.api

import com.example.weatherapphiltretrobersyte.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("weather/Luanda")
    suspend fun getWeather():Response<Weather>
}