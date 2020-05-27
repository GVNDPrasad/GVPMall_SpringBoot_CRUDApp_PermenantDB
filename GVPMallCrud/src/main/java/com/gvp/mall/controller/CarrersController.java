package com.gvp.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gvp.mall.dto.CarrersDTO;
import com.gvp.mall.service.CarrersService;

@RestController
@RequestMapping(value = "/CarrersController")
public class CarrersController {
	
	@Autowired
	private CarrersService cs;
	
	@PostMapping(value = "/add")
	public CarrersDTO insert(@RequestBody CarrersDTO carObj) {
		System.out.println("http://localhost:8001/CarrersController/add");
		return cs.insert(carObj);//Insert Operation
	}
	
	@PostMapping(value = "/addAll")
	public Iterable<CarrersDTO> insertAll(@RequestBody List<CarrersDTO> carObj) {
		System.out.println("http://localhost:8001/CarrersController/addAll");
		return cs.insertAll(carObj);//Insert Operation
	}
	
	
	@GetMapping(value = "/getByRefID/{refID}")
	public CarrersDTO getDataByReferID(@PathVariable("refID") String refID) {
		System.out.println("http://localhost:8001/CarrersController/getByRefID/REF_SM_0234");
	  return cs.getDataByReferID(refID);//Get operation with Derive Method
	}
	
	@GetMapping(value = "/getAndKeyData/{exp}/{loc}")
	public CarrersDTO getAndKeyData(@PathVariable("exp") int exp,@PathVariable("loc") String loc) {
		System.out.println("http://localhost:8001/CarrersController/getAndKeyData/6/Chennai");
		return cs.getAndKeyData(exp, loc);//Get operation with Derive Method & AND keyword
	}
	
	@GetMapping(value = "/getOrKeyData/{exp}/{loc}")
	public CarrersDTO getOrKeyData(@PathVariable("exp") int exp,@PathVariable("loc") String loc) {
		System.out.println("http://localhost:8001/CarrersController/getOrKeyData/3/Chennai");
		return cs.getOrKeyData(exp, loc);//Get operation with Derive Method & Or keyword
	}

	@GetMapping(value = "/getLikeKeyData/{loc}")
	public CarrersDTO getLikeKeyData(@PathVariable("loc") String loc) {
		System.out.println("http://localhost:8001/CarrersController/getLikeKeyData/Chennai");
		return cs.getLikeKeyData(loc);//Get operation with Derive Method & Like keyword
	}

}
