package com.weatherapi.service;

import com.weatherapi.model.WeatherRequest;
import com.weatherapi.model.WeatherResponse;

public interface WeatherService {
	WeatherResponse getWeatherDetails(WeatherRequest request);
}
