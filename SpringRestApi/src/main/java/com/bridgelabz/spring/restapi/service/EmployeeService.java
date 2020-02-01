package com.bridgelabz.spring.restapi.service;

import java.util.List;

import com.bridgelabz.spring.restapi.model.Employee;

public interface EmployeeService {

	public void saveOrUpdate(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public Employee getById(int id);
	
	public void deleteEmployee(int id);
}
