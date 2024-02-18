package com.example.TravelPlanningSystem.exception;

public class TravelAgenciesNotFound extends RuntimeException
{
	String message;

	public String getMessage() {
		return message;
	}

	public TravelAgenciesNotFound(String message) {
		this.message = message;
	}

}