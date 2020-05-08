package com.gvp.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gvp.mall.dto.TicketCountersDTO;
import com.gvp.mall.service.CounterService;

@RestController
@RequestMapping(value = "/counterController")
public class CounterController {
	
	@Autowired
	private CounterService cs;
	
	@PostMapping(value = "/insert")
	public TicketCountersDTO add(@RequestBody TicketCountersDTO counterObj) {
		return cs.add(counterObj);
	}
	
	@GetMapping(value="/getAll")
	public Iterable<TicketCountersDTO> getAllTickets(){
		return cs.getAllTickets();
	}
	
}
