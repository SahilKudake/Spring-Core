package com.bridgelabz.spring.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.spring.restapi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
