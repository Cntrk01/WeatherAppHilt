package com.example.weatherapphiltretrobersyte.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapphiltretrobersyte.model.Weather
import com.example.weatherapphiltretrobersyte.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel
@Inject constructor(private val repository: WeatherRepository):ViewModel(){

    private val _resp=MutableLiveData<Weather>()
    val weatherResp:LiveData<Weather>
        get() = _resp

    init {
        getWeather()
    }
    private fun getWeather()=viewModelScope.launch {
        repository.getWeather().let {
            if(it.isSuccessful){
                _resp.postValue(it.body())

            }else{
                Log.d("tag","Error : ${it.message()}")
            }
        }
    }

}