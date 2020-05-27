package com.gvp.mall.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gvp.mall.dto.EmpDTO;

@Repository
public interface EmpInterfaceDAO extends CrudRepository<EmpDTO, Integer> {

	
	
	

}
