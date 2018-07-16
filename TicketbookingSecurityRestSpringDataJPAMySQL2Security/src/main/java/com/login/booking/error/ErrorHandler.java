/*package com.login.booking.error;


import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.login.booking.controller.TicketNotFoundException;

@ControllerAdvice
@RestController
public class ErrorHandler extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(value=TicketNotFoundException.class)
	public final Errorh exceptionHandler(TicketNotFoundException tnfe , WebRequest request)
	{
		Error error = new Error(new java.sql.Date() , tnfe.getMessage(), request.getDescription(false));
		return new Errorh(error, HttpStatus.NOT_FOUND);
	}
	
}*/
