package com.login.booking.error;

import java.util.Date;

import javax.xml.soap.Detail;

public class Error 
{
	private java.sql.Date timestaml;
	private String message;
	private String details;
	
	public Error(java.sql.Date timestaml, String message, String details) {
		super();
		this.timestaml = timestaml;
		this.message = message;
		this.details = details;
	}
	
	
	
}
