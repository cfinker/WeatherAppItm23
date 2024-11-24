package at.fhjoannuem.weatherappitm23.data

import kotlinx.serialization.Serializable

@Serializable
data class WeatherData(
    val current: WeatherCurrentData,
)
