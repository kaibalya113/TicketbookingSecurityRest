package com.login.booking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Data Not Found")
public class TicketNotFoundException extends RuntimeException 
{

	/*public TicketNotFoundException(String string) {
		System.out.println("h");
	}
	*/
}
