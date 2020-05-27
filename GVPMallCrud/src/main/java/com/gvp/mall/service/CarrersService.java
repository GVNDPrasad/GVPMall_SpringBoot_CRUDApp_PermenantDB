package com.gvp.mall.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvp.mall.dao.CarrersDAO;
import com.gvp.mall.dto.CarrersDTO;

@Service
public class CarrersService {
	
	@Autowired
	private CarrersDAO cd;
	
	/* Saving Operation */
	public CarrersDTO insert(CarrersDTO carObj) {
		return cd.save(carObj);//Single object saving in Database
	}
	
	public Iterable<CarrersDTO> insertAll(List<CarrersDTO> carObj) {
		return cd.saveAll(carObj);//Multiple objects/Bulk Data saving in Database
	}
	
	/* Search Operation */
	public Iterable<CarrersDTO> findCarrersAllById(List<Integer> carId) {
		return cd.findAllById(carId);//Multiple objects/Bulk Data getting in Database
	}
	
	/* Derived methods without primary key */
	public CarrersDTO getDataByReferID(String refID) {
		return cd.findByRefId(refID);
	}
	
	public CarrersDTO getAndKeyData(int exp,String loc) {
		return cd.findByJobExperienceAndJobLocation(exp, loc);
	}
	
	public CarrersDTO getOrKeyData(int exp,String loc) {
		return cd.findByJobExperienceOrJobLocation(exp, loc);
	}
	
	public CarrersDTO getLikeKeyData(String loc) {
		return cd.findByJobLocationLike(loc);
	}

}
