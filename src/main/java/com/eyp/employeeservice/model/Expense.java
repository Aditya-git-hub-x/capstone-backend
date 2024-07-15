package com.eyp.employeeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long exid;
	
	@Column
	String type;
	
	@Column 
	int amount;
	
	@Column
	Long eid;
	
	Expense(){
		
	}

	public Expense(String type, int amount, Long eid) {
		super();
		this.type = type;
		this.amount = amount;
		this.eid = eid;
	}

	public Long getExid() {
		return exid;
	}

	public void setExid(Long exid) {
		this.exid = exid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}
	
	
	

}
