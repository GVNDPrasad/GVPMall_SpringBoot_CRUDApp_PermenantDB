package com.gvp.mall.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gvp.mall.dto.CarrersDTO;

@Repository
public interface CarrersDAO extends CrudRepository<CarrersDTO, Integer>{
	
	//Derived methods for getting the data without primary key
	
	//Passing single Column with findBy method without primary key
	public CarrersDTO findByRefId(String refId);
	
	//Passing multiple Columns with findBy method & AND keyword without primary key
	public CarrersDTO findByJobExperienceAndJobLocation(int exp,String loc);
	
	//Passing multiple Columns with findBy method & OR keyword without primary key
	public CarrersDTO findByJobExperienceOrJobLocation(int exp,String loc);
	
	//Passing single column with findBy method & LiKE keyword without primary key
	public CarrersDTO findByJobLocationLike(String loc);
	
	//public CarrersDTO findByJobExperienceLessThanEqual(int exp);
	
	//public CarrersDTO findByJobExperienceGreaterThanEqual(int exp);
	
	//public CarrersDTO findByJobLocationLike(String loc);

}
