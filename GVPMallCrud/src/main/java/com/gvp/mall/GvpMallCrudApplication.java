package com.gvp.mall;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gvp.mall.dto.TicketCountersDTO;
import com.gvp.mall.service.CounterService;

@SpringBootApplication
public class GvpMallCrudApplication implements CommandLineRunner{

	@Autowired
	private CounterService cs;
	
	public static void main(String[] args) {
		SpringApplication.run(GvpMallCrudApplication.class, args);
		System.out.println("Every execution Starts from Boot class");
		System.out.println("GVP Mall-Port No:8001");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		TicketCountersDTO tc = new TicketCountersDTO();
		tc.setCounterCode("CC334");
		tc.setCounterName("Counter4");
		tc.setCounterType("Online");
		tc.setCounterOpsDate(new Date());
		tc.setCounterStatus("Inactive");
		tc.setCounterMailId("cc224@gvpmall.com");
		tc.setCounterManager("Mahesh");
		
		System.out.println("DTO Obj data:"+tc);
		cs.add(tc);
		
	}

}
