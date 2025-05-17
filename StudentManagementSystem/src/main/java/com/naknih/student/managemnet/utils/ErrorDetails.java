package com.naknih.student.managemnet.utils;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private String response;
	private LocalDateTime timestamp;
	private String message;
	private String details;
	
	
	
	public ErrorDetails(String response, LocalDateTime timestamp, String message, String details) {
		super();
		this.response = response;
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public ErrorDetails(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	
	public String getResponse() {
		return response;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}

