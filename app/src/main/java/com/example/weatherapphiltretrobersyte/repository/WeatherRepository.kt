package com.example.weatherapphiltretrobersyte.repository

import com.example.weatherapphiltretrobersyte.api.ApiService
import javax.inject.Inject

class WeatherRepository
 @Inject constructor(private val apiService: ApiService){
     suspend fun getWeather() = apiService.getWeather()
}