package com.shadrak.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.shadrak.binding.Passenger;
import com.shadrak.binding.Ticket;

@Service
public class TicketServiceImp implements TicketService {

	Map<Integer, Ticket>map =new HashMap<>();
	
	@Override
	public Ticket bookTicket(Passenger p) {
	
		Ticket t = new Ticket();
		Random r = new Random();
		int id = r.nextInt(12);
		t.setTicket_num(id);
		
		BeanUtils.copyProperties(p, t);
		
		t.setStatus("CONFIRMED");
	
		map.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getallTickets() {
		return map.values();
		
	}

}
