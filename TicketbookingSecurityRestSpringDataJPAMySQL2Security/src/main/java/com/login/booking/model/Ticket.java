package com.login.booking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket 
{
	@Id
	@Column(name="ticketid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long TicketId;
	@Column(name="datetime")
	private Date Datetime;
	@Column(name="name" , nullable= false)
	private String PassengerName;
	@Column(name="sstaton")
	private String SourceStation;
	@Column(name="destination")
	private String Destination;
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(long ticketId, Date datetime, String passengerName, String sourceStation, String destination) {
		super();
		TicketId = ticketId;
		Datetime = datetime;
		PassengerName = passengerName;
		SourceStation = sourceStation;
		Destination = destination;
	}
	public long getTicketId() {
		return TicketId;
	}
	public void setTicketId(long ticketId) {
		TicketId = ticketId;
	}
	public Date getDatetime() {
		return Datetime;
	}
	public void setDatetime(Date datetime) {
		Datetime = datetime;
	}
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
	public String getSourceStation() {
		return SourceStation;
	}
	public void setSourceStation(String sourceStation) {
		SourceStation = sourceStation;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	
	
	
}
