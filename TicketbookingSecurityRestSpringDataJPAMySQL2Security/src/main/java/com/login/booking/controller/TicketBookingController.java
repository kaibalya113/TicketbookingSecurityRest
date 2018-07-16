package com.login.booking.controller;

import java.io.FileNotFoundException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.booking.model.Ticket;
import com.login.booking.service.TicketBookingService;

@RestController
@RequestMapping(value="/start")
public class TicketBookingController 
{
	
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value="/create")
	public Ticket create(@RequestBody Ticket ticket)
	{
		return ticketBookingService.create(ticket);
	}
	
	/*@GetMapping(value="/tickets/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId")Integer ticketId)
	{
		return ticketBookingService.getTicketById(ticketId);
	}*/
	
	
	//@ExceptionHandler(TicketNotFoundException.class)
	/*@GetMapping(value="/tickets/{ticketId}")
	public Optional<Ticket> getTicketByIdnotfound(@PathVariable("ticketId")Integer ticketId) throws TicketNotFoundException
	{
		if(ticketId == null) {
			throw new TicketNotFoundException();
			//return ticketBookingService.getTicketById(ticketId);
		}
		return ticketBookingService.getTicketById(ticketId);
	}*/
	
	
	@GetMapping(value="/tickets/{ticketId}")
	public Optional<Ticket> getTicketByIdnotfound(@PathVariable Long ticketId)
	{
		
		if(ticketId == 16 || ticketId >=20)
		{
			throw new TicketNotFoundException();
		}
		
		return ticketBookingService.getTicketById(ticketId);
	}
	
	
	
	@GetMapping(value="/ticket/getall")
	public Iterable<Ticket> getall()
	{
		
		return ticketBookingService.getall();
	}
	
	@DeleteMapping(value="/ticket/{ticketId}")
	public void delete(@PathVariable("ticketId")Long ticketId)
	{
		ticketBookingService.delete(ticketId);
	}
	
}
