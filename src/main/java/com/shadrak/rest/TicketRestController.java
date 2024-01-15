package com.shadrak.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shadrak.binding.Passenger;
import com.shadrak.binding.Ticket;
import com.shadrak.service.TicketService;

@RestController
public class TicketRestController {

	@Autowired
	private TicketService service;
	
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookticket(@RequestBody Passenger p){
		Ticket ticket =service.bookTicket(p);
		
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@GetMapping("/tickets")
	public ResponseEntity<Collection<Ticket>> getTicket(){
		Collection<Ticket> alltickets =service.getallTickets();
		return new ResponseEntity<>(alltickets, HttpStatus.OK);
	}
}
