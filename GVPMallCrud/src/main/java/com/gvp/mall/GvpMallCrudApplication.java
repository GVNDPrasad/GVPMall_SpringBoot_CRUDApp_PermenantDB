package com.gvp.mall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gvp.mall.controller.CarrersController;
import com.gvp.mall.dto.CarrersDTO;
import com.gvp.mall.dto.TicketCountersDTO;
import com.gvp.mall.service.CarrersService;
import com.gvp.mall.service.CounterService;

@SpringBootApplication
public class GvpMallCrudApplication implements CommandLineRunner{

	@Autowired
	private CounterService cs;
	
	@Autowired 
	private CarrersService car;
	
	@Autowired
	private CarrersController cc;
	
	private static final Logger logger = LoggerFactory.getLogger(GvpMallCrudApplication.class);
	
	public static void main(String[] args) {
		  logger.info("this is a info message");
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
		SpringApplication.run(GvpMallCrudApplication.class, args);
		System.out.println("Every execution Starts from Boot class");
		System.out.println("GVP Mall-Port No:8001");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Saving single record
		//savingData();
		
		//Saving Multiple records/Bulk Data
		//savingBulkData();
		
		//Getting Multiple records/Bulk Data
		//gettingBulkData();
	 	   
	}
	
	public void savingData() {
		
				TicketCountersDTO tc = new TicketCountersDTO();
				tc.setCounterCode("CC321");
				tc.setCounterName("Counter13");
				tc.setCounterType("Online");
				tc.setCounterOpsDate(new Date());
				tc.setCounterStatus("Inactive");
				tc.setCounterMailId("cc321@gvpmall.com");
				tc.setCounterManager("Mahesh");
				
				System.out.println("DTO Obj data:"+tc);
				cs.add(tc);
	}
	
	public void savingBulkData() {
		List<CarrersDTO> addCarrerObjs = Arrays.asList(
									 			new CarrersDTO("REF_SM_0250", "Supervisor1", "Degree", "Permenent", 3, "Full Time", "Bangalore", new Date()),
									 			new CarrersDTO("REF_SM_0251", "Supervisor2", "Degree", "Permenent", 4, "Full Time", "Hyderabad", new Date()),
									 			new CarrersDTO("REF_SM_0252", "Supervisor3", "Degree", "Contract", 4, "Full Time", "Pune", new Date()),
									 			
									 			new CarrersDTO("REF_SM_0253", "Assitent Manager", "MBA/PG", "Permenent", 6, "Full Time", "Bangalore", new Date()),
									 			new CarrersDTO("REF_SM_0254", "Assitent Manager", "MBA/PG", "Contract", 6, "Full Time", "Hyderabad", new Date()),
									 			new CarrersDTO("REF_SM_0255", "Assitent Manager", "MBA/PG", "Permenent", 8, "Full Time", "Pune", new Date()),
									 			
									 			new CarrersDTO("REF_SM_0256", "Manager", "MBA/PG", "Permenent", 10, "Full Time", "Bangalore", new Date()),
									 			new CarrersDTO("REF_SM_0257", "Manager", "MBA/PG", "Permenent", 15, "Full Time", "Hyderabad", new Date()),
									 			new CarrersDTO("REF_SM_0258", "Manager", "MBA/PG", "Contract", 12, "Full Time", "Pune", new Date())
										 );
		System.out.println("Carrers Obj List"+addCarrerObjs);
		
		
		Iterable<CarrersDTO> jobListData = cc.insertAll(addCarrerObjs);
		for(CarrersDTO c: jobListData) {
			System.out.println(c);
			System.out.println(c.getRefId());
		}

	}
	
	public void gettingBulkData() {
		
		//Getting needed records in Database by using findAllById or Getting Bulk data based on primary key
	 	List<Integer> gl = new ArrayList<>();
	 	   gl.add(1);//1 is primary key in DB
	 	   gl.add(2);
	 	   gl.add(8);
	 	   gl.add(6);
	 	   gl.add(5);
	 	   gl.add(3);
	 	   
	 	   Iterable<CarrersDTO> getBulkData = car.findCarrersAllById(gl);
	 	   for(CarrersDTO cl: getBulkData) {
	 		   System.out.println(cl);
	 	   }
	}

}
