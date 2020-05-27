package com.gvp.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gvp.mall.dto.EmpDTO;
import com.gvp.mall.service.EmpService;

@RestController
@RequestMapping(value = "/empController")
public class EmpController {

	@Autowired
	EmpService es;

	@GetMapping(value = "/mine")
	public String mine() {
		return "Hi Employee Controller";
	}

	@PostMapping(value = "/add")
	public EmpDTO add(@RequestBody EmpDTO empObj) {
		System.out.println("Entered add() -> EmpController : Saving Single Record:");
		return es.add(empObj);
	}

	@PostMapping(value = "/addAll")
	public Iterable<EmpDTO> addAll(@RequestBody List<EmpDTO> empList) {
		System.out.println("Entered addAll() -> EmpController : Saving All Records:");
		return es.addAll(empList);
	}
	
	@GetMapping(value = "/getAll")
	public Iterable<EmpDTO> getAll(){
		System.out.println("Entered getAll() -> EmpController : Getting All Records:");
		return es.getAll();
	}
	
	@GetMapping(value= "/get/{empId}")
	public EmpDTO get(@PathVariable int empId) {
		System.out.println("Entered get() -> EmpController : Getting Single record:");
		return es.get(empId);
	}
	
	@DeleteMapping(value= "/del/{empId}")
	public void del(@PathVariable int empId) {
		System.out.println("Entered del() -> EmpController : Deleting Single record:");
		es.del(empId);
	}
	
	@DeleteMapping(value= "/deleteAll")
	public void delAll() {
		System.out.println("Entered delAll() -> EmpController : Deleting All records:");
		es.delAll();
	}
	
	@PutMapping(value= "/update/{empId}/{empStatus}")
	public EmpDTO update(@PathVariable int empId, @PathVariable String empStatus) {
		System.out.println("Entered update() -> EmpController : Updating a record:");
		return es.update(empId, empStatus);
	}
}
