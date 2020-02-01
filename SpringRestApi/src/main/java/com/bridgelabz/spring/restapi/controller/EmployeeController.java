package com.bridgelabz.spring.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.spring.restapi.model.Employee;
import com.bridgelabz.spring.restapi.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee) {
		service.saveOrUpdate(employee);
		return employee;
	}
	
	@GetMapping("/list")
	public List<Employee> getAll(){
		return service.getAllEmployee();
	}
	
	@GetMapping("/list/{id}")
	public Employee getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable (value = "id") int id) {
		service.deleteEmployee(id);
		return "Deleted " + id;
	}

}
