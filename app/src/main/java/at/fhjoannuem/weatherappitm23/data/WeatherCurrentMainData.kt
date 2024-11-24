package at.fhjoannuem.weatherappitm23.data

import kotlinx.serialization.Serializable

@Serializable
data class WeatherCurrentMainData(
    val text: String,
)
