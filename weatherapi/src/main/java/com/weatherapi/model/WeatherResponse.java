package com.weatherapi.model;

import org.json.JSONArray;

public class WeatherResponse {
	private String status;
	private String msg;
	private JSONArray weatherData;
	
	public WeatherResponse() {
	}

	public WeatherResponse(String status, String msg, JSONArray weatherData) {
		super();
		this.status = status;
		this.msg = msg;
		this.weatherData = weatherData;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public JSONArray getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(JSONArray weatherData) {
		this.weatherData = weatherData;
	}

}
