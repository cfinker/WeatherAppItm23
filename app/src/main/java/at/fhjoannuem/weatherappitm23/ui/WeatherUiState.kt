package at.fhjoannuem.weatherappitm23.ui

import at.fhjoannuem.weatherappitm23.data.WeatherData

/**
 * UI state for the Home screen
 */
sealed interface WeatherUiState {
    data class Success(val weatherData: WeatherData) : WeatherUiState
    object Error : WeatherUiState
    object Loading : WeatherUiState
    object InputRequired : WeatherUiState
}
