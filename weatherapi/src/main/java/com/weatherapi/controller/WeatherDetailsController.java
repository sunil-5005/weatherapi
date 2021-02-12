package com.weatherapi.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger LOGGER = LoggerFactory.getLogger(WeatherDetailsController.class);	
	
	@Autowired
	private WeatherService weatherService;


	@RequestMapping(method = RequestMethod.GET, 
					value = "/getTomorrowsWeather", 
					consumes = MediaType.APPLICATION_JSON_VALUE, 
					produces = MediaType.APPLICATION_JSON_VALUE)
	public WeatherResponse getTomorrowsWeather(@RequestBody final WeatherRequest weatherRequest, HttpServletRequest request) {
		WeatherResponse weatherResponse = null;
		
		try {
			weatherResponse = weatherService.getWeatherDetails(weatherRequest);
		} catch (Exception e) {
			LOGGER.error("Error while getting weather details: " + e.getMessage());
		}
		return weatherResponse;
	}

	
	
}
