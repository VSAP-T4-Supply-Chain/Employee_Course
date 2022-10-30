package com.example.EmployeeAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee_authentication {

	@Id
	private int user_id;
	private String last_login;
	private int employee_id;
	private boolean employee_valid;
	private String password;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getLast_login() {
		return last_login;
	}
	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public boolean isEmployee_valid() {
		return employee_valid;
	}
	public void setEmployee_valid(boolean employee_valid) {
		this.employee_valid = employee_valid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "employee_authentication [user_id=" + user_id + ", last_login=" + last_login + ", employee_id="
				+ employee_id + ", employee_valid=" + employee_valid + ", password=" + password + "]";
	}
	
}
