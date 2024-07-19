package com.eyp.employeeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long exid;
	
	@Column
	private String type;
	
	@Column
	private String status;
	
	@Column 
	private int amount;
	
	@Column
	private Long eid;
	
	public Expense(Long exid, String type, String status, int amount, Long eid, byte[] bill, String billName) {
		super();
		this.exid = exid;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.eid = eid;
		this.bill = bill;
		this.billName = billName;
	}

	@Column
	@Lob
	private byte[] bill;
	
	@Column
	private String billName;
	
	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	public Expense(Long exid, String type, String status, int amount, Long eid, byte[] bill) {
		super();
		this.exid = exid;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.eid = eid;
		this.bill = bill;
	}

	public Expense(String type, int amount, Long eid, byte[] bill) {
		super();
		this.type = type;
		this.amount = amount;
		this.eid = eid;
		this.bill = bill;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	Expense(){
		
	}


	public byte[] bill() {
		return bill;
	}

	public void setImageData(byte[] bill) {
		this.bill = bill;
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