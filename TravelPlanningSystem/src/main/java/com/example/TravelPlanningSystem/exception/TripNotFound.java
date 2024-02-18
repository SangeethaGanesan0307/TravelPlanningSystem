package com.example.TravelPlanningSystem.exception;

public class TripNotFound extends RuntimeException
{
	String message;

	public String getMessage() {
		return message;
	}

	public TripNotFound(String message) {
		this.message = message;
	}

}
