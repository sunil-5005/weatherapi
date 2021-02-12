package com.weatherapi.model;

public class WeatherRequest {

	private String zipCode;
	private String contryCode;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getContryCode() {
		return contryCode;
	}

	public void setContryCode(String contryCode) {
		this.contryCode = contryCode;
	}

	@Override
	public String toString() {
		return "WeatherRequest [zipCode=" + zipCode + ", contryCode=" + contryCode + "]";
	}
	
}
