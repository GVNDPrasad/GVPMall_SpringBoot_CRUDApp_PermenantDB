package com.gvp.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvp.mall.dao.CounterInterfaceDAO;
import com.gvp.mall.dto.TicketCountersDTO;

@Service
public class CounterService {
	
	@Autowired
	private CounterInterfaceDAO cid;//Dependency Injection
	
	public TicketCountersDTO add(TicketCountersDTO counterObj) {
		return cid.save(counterObj);
	}
	
	public Iterable<TicketCountersDTO> getAllTickets(){
		return cid.findAll();
	}

}
