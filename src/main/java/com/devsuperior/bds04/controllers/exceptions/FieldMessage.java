package com.devsuperior.bds04.controllers.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fieldName;
	private String message;
	
	public FieldMessage() {
	}

	public FieldMessage(String fieldName, String message) {
		this.message = message;
		this.fieldName = fieldName;
	}

	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		this.message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

}
