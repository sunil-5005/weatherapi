package com.weatherapi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weatherapi.model.WeatherRequest;
import com.weatherapi.model.WeatherResponse;
import com.weatherapi.service.WeatherService;

@RestController
public class WeatherDetailsController {

	@Autowired
	private WeatherService weatherService;


	@RequestMapping(method = RequestMethod.GET, 
					value = "/getTomorrowsWeather", 
					consumes = MediaType.APPLICATION_JSON_VALUE, 
					produces = MediaType.APPLICATION_JSON_VALUE)
	public WeatherResponse getTomorrowsWeather(@RequestBody final WeatherRequest weatherRequest, HttpServletRequest request) {
		return weatherService.getWeatherDetails(weatherRequest);
	}

	
	
}
