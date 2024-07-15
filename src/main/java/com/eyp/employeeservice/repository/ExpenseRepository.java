package com.eyp.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eyp.employeeservice.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
