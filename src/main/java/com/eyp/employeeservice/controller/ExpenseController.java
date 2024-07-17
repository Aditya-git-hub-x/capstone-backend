package com.eyp.employeeservice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eyp.employeeservice.exception.ResourceNotFoundException;
import com.eyp.employeeservice.model.Expense;
import com.eyp.employeeservice.repository.ExpenseRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class ExpenseController {
	
	@Autowired
	private ExpenseRepository expenseRepository;
	
	@GetMapping("/exp")
	public List<Expense> getAllEmployees(){
		return expenseRepository.findAll();
	}
	@PostMapping("/exp")
	public Expense createEmployee(@RequestBody Expense expense) {
		expense.setStatus("Pending");
		return expenseRepository.save(expense);
	} 
	
	@GetMapping("/exp/{exid}")
	public ResponseEntity<Expense> getExpenseById(@PathVariable Long exid) {
		Expense employee = expenseRepository.findById(exid)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + exid));
		return ResponseEntity.ok(employee);
	}
	
	@PutMapping("/exp/{exid}")
	public ResponseEntity<Expense> updateExpense(@PathVariable Long exid){
		Expense expense = expenseRepository.findById(exid)
				.orElseThrow(() -> new ResourceNotFoundException("Expense not exist with id :" + exid));
		
		expense.setStatus("Approved");
		
		Expense updatedExpense = expenseRepository.save(expense);
		return ResponseEntity.ok(updatedExpense);
	}
	
	@DeleteMapping("/exp/{exid}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long exid){
		Expense expense = expenseRepository.findById(exid)
				.orElseThrow(() -> new ResourceNotFoundException("Expense not exist with id :" + exid));
		
		expenseRepository.delete(expense);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
