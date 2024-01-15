package com.shadrak.service;

import java.util.Collection;

import com.shadrak.binding.Passenger;
import com.shadrak.binding.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger p);
	
	public Collection<Ticket> getallTickets();
}
