package com.example.EmployeeAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class designation {

	@Id
	private int designation_id;
	private String employee_name;
	private int employ_id;
	private String project_manager;
	private String specific_domain;
	private String specific_technology;
	public int getDesignation_id() {
		return designation_id;
	}
	public void setDesignation_id(int designation_id) {
		this.designation_id = designation_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getEmploy_id() {
		return employ_id;
	}
	public void setEmploy_id(int employ_id) {
		this.employ_id = employ_id;
	}
	public String getProject_manager() {
		return project_manager;
	}
	public void setProject_manager(String project_manager) {
		this.project_manager = project_manager;
	}
	public String getSpecific_domain() {
		return specific_domain;
	}
	public void setSpecific_domain(String specific_domain) {
		this.specific_domain = specific_domain;
	}
	public String getSpecific_technology() {
		return specific_technology;
	}
	public void setSpecific_technology(String specific_technology) {
		this.specific_technology = specific_technology;
	}
	@Override
	public String toString() {
		return "designation [designation_id=" + designation_id + ", employee_name=" + employee_name + ", employ_id="
				+ employ_id + ", project_manager=" + project_manager + ", specific_domain=" + specific_domain
				+ ", specific_technology=" + specific_technology + "]";
	}
	
}
