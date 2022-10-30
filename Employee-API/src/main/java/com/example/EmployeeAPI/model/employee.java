package com.example.EmployeeAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {

	@Id
	private int employee_id;
	private String employee_name;
	private String email_id;
	private String address;
	private String employee_section;
	private String location;
	private String password;
	private int user_id;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmployee_section() {
		return employee_section;
	}
	public void setEmployee_section(String employee_section) {
		this.employee_section = employee_section;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", email_id=" + email_id
				+ ", address=" + address + ", employee_section=" + employee_section + ", location=" + location
				+ ", password=" + password + ", user_id=" + user_id + "]";
	}
	
}
