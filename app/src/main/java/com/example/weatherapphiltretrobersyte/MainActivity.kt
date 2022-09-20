package com.example.weatherapphiltretrobersyte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.weatherapphiltretrobersyte.databinding.ActivityMainBinding
import com.example.weatherapphiltretrobersyte.viewModel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val viewModel:WeatherViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.weatherResp.observe(this, Observer {
            binding.apply {
                tvTemperature.text=it.temperature
                tvCity.text="Luanda"
                tvDescription.text=it.description
                tvWind.text=it.wind

                val forecast1= it.forecast[0]
                val forecast2= it.forecast[1]
                val forecast3= it.forecast[2]

                tvforecast1.text="${forecast1!!.temperature}/${forecast1!!.wind}"
                tvforecast2.text="${forecast2!!.temperature}/${forecast2!!.wind}"
                tvforecast3.text="${forecast3!!.temperature}/${forecast3!!.wind}"

            }
        })

    }
}

