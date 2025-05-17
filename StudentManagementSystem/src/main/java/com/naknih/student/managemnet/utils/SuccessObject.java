package com.naknih.student.managemnet.utils;

import java.io.Serializable;

public class SuccessObject implements Serializable {
	
	private String response;
		
	private String message;
	
	private Object responseObject;
	
	

	public SuccessObject() {
		super();
	}

	public SuccessObject(String message, Object responseObject) {
		super();
		this.message = message;
		this.responseObject = responseObject;
	}
	

	public SuccessObject(String response, String message, Object responseObject) {
		super();
		this.response = response;
		this.message = message;
		this.responseObject = responseObject;
	}
	
	public SuccessObject(String response, String message) {
		super();
		this.response = response;
		this.message = message;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(Object responseObject) {
		this.responseObject = responseObject;
	}
	
}
