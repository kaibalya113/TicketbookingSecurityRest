/*package com.login.booking.controller;

import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

@RestController
public class error implements ErrorController {

	public static final String PATH="/error";
	@Override
	public String getErrorPath() {
		
		return PATH;
	}

	@GetMapping(value=PATH)
	public String ErrorMessage() throws TicketNotFoundException
	{
		return "not found";
	}
	

}
*/