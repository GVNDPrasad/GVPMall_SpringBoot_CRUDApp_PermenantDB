package com.gvp.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvp.mall.dao.EmpInterfaceDAO;
import com.gvp.mall.dto.EmpDTO;

@Service
public class EmpService {
	
	@Autowired
	EmpInterfaceDAO ed;
	
	public EmpDTO add(EmpDTO er){
		System.out.println("Entered save() -> EmpService");
		return ed.save(er);
	}
	
	public Iterable<EmpDTO> addAll(List<EmpDTO> eb) {
		System.out.println("Entered saveAll() -> EmpService");
		return ed.saveAll(eb);
	}
	
	public Iterable<EmpDTO> getAll(){
		System.out.println("Entered getAll() -> EmpService");
		return ed.findAll();
	}
	
	public EmpDTO get(int empId) {
		System.out.println("Entered get() -> EmpService");
		return ed.findById(empId).orElse(new EmpDTO());
		// orElse(new EmpDTO()) usage is If data not available It will share default values like null,0 etc without exception
	}
	
	public void del(int empId) {
		System.out.println("Entered del() -> EmpService");
		ed.deleteById(empId);
	}
	
	public void delAll() {
		System.out.println("Entered delAll() -> EmpService");
		ed.deleteAll();
	}
	
	public EmpDTO update(int empId,String empStatus) {
		System.out.println("Entered update() -> EmpService");
		
		EmpDTO empObj = get(empId);
		System.out.println("Employee Data:"+empObj);
		empObj.setEmpStatus(empStatus);
		
		return ed.save(empObj);
	}
	
	

}
