package com.example.demo.model;

public class Model {
	
	public String Message;

	public Model(String message) {
		super();
		Message = message;
	}

	@Override
	public String toString() {
		return "Model [Message=" + Message + "]";
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
}
