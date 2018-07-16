package com.login.booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.booking.Dao.TicketBookingDao;
import com.login.booking.model.Ticket;

@Service
public class TicketBookingService 
{
	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket create(Ticket ticket)
	{
		return ticketBookingDao.save(ticket);
	}
	
	public Optional<Ticket> getTicketById(Long ticketId)
	{
		return ticketBookingDao.findById(ticketId);
	}
	
	public void delete(Long ticketId)
	{
		ticketBookingDao.deleteById(ticketId);
	}
	
	public Iterable<Ticket> getall()
	{
		return ticketBookingDao.findAll();
	}
	
	/*public Optional<Ticket> update(Integer ticketId, String newname)
	{
		Optional<Ticket> ticket = ticketBookingDao.findById(ticketId);
		ticket.get();
		
		
		return 
	}*/
	
}
