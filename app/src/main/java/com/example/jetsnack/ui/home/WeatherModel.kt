package com.example.jetsnack.ui.home

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("main") val main: MainData,
    @SerializedName("weather") val weatherDescription: List<Description>,
    @SerializedName("name") val cityName: String
)

data class MainData(
    @SerializedName("temp") val temp: Float,
    @SerializedName("humidity") val humidity: Int
)

data class Description(
    @SerializedName("description") val info: String
)