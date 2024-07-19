package com.eyp.employeeservice.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eyp.employeeservice.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	
	@Query("SELECT e FROM Expense e WHERE e.eid = :eid")
	List<Expense> findByEid(@Param("eid") long eid) ;


}
