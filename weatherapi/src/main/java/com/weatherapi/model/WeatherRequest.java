package com.weatherapi.model;

public class WeatherRequest {

	private String zipCode;
	private String countryCode;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "WeatherRequest [zipCode=" + zipCode + ", contryCode=" + countryCode + "]";
	}
	
}
