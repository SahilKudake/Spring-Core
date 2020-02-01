package com.bridgelabz.spring.restapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.spring.restapi.model.Employee;
import com.bridgelabz.spring.restapi.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public void saveOrUpdate(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return (List<Employee>)repository.findAll();
	}

	@Override
	public Employee getById(int id) {
		
		return repository.findById(id).get();
	}

	@Override
	public void deleteEmployee(int id) {
		repository.deleteById(id);
		
	}

}
