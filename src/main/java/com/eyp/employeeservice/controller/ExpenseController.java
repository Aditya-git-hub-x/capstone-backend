package com.eyp.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eyp.employeeservice.model.Expense;
import com.eyp.employeeservice.repository.ExpenseRepository;

@RestController
@RequestMapping("/exp")
public class ExpenseController {
	
	@Autowired
	private ExpenseRepository expenseRepository;
	
	@GetMapping("/get")
	public List<Expense> getAllEmployees(){
		return expenseRepository.findAll();
	}
	@PostMapping("/post")
	public Expense createEmployee(@RequestBody Expense expense) {
		return expenseRepository.save(expense);
	} 

}
