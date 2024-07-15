package com.eyp.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eyp.employeeservice.model.Employee;
import com.eyp.employeeservice.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:3000")//--> to connect react
@RestController
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/emp")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	@PostMapping("/emp")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	} 
}
