package com.login.booking.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.login.booking.model.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Long>{

	

}
