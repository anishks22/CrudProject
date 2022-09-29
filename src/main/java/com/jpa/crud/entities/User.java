package com.jpa.crud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String EmpName;
	
	private String EmpCity;
	
	private String EmpStatus;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String empName, String empCity, String empStatus) {
		super();
		this.id = id;
		EmpName = empName;
		EmpCity = empCity;
		EmpStatus = empStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpCity() {
		return EmpCity;
	}

	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}

	public String getEmpStatus() {
		return EmpStatus;
	}

	public void setEmpStatus(String empStatus) {
		EmpStatus = empStatus;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", EmpName=" + EmpName + ", EmpCity=" + EmpCity + ", EmpStatus=" + EmpStatus + "]";
	}
	
	
	
	

}
