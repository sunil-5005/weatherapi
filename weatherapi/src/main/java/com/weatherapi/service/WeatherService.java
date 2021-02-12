package com.weatherapi.service;

import java.io.IOException;

import com.weatherapi.model.WeatherRequest;
import com.weatherapi.model.WeatherResponse;

public interface WeatherService {
	WeatherResponse getWeatherDetails(WeatherRequest weatherRequest) throws IOException;
}
