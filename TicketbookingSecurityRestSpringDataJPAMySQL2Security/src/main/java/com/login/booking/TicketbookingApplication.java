package com.login.booking;

import java.util.Date;

import javax.sql.DataSource;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.login.booking.config.SecurityConfig;
import com.login.booking.model.Ticket;
import com.login.booking.service.TicketBookingService;

@SpringBootApplication
public class TicketbookingApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(TicketbookingApplication.class, args);
		//ConfigurableApplicationContext applicationContext= SpringApplication.run(TicketbookingApplication.class, args);
		/*TicketBookingService ticketBookingService=applicationContext.getBean("ticketBookingService", TicketBookingService.class);
		
		Ticket ticket = new Ticket();
		ticket.setDatetime(new Date());
		ticket.setDestination("bhubaneswar");
		ticket.setPassengerName("krishna");
		ticket.setSourceStation("pune");
		
		ticketBookingService.create(ticket);*/
	}
}
