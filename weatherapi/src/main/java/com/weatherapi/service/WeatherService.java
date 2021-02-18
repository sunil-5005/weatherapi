package com.weatherapi.service;

import java.io.IOException;

import org.json.JSONObject;

import com.weatherapi.model.WeatherRequest;

public interface WeatherService {
	JSONObject getWeatherDetails(WeatherRequest weatherRequest) throws IOException;
}
