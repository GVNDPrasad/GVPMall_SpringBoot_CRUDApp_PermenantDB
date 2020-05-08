package com.gvp.mall.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gvp.mall.dto.TicketCountersDTO;

@Repository
public interface CounterInterfaceDAO extends CrudRepository<TicketCountersDTO, Integer>{
	//No need to write code for CRUD operations automatically CRUD operations done using CrudRepository
}
