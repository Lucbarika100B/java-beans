package com.beanshmw1.firstproject.entities;

public class Employee {
	
	private String firstName;
	private String lastName; 
	private int salary; 
	private String email; 
	private Department department; 
	
	public Employee(String firstName, String lastName, int salary, String email, Department department) {
		
		
		this.firstName = firstName;
		this.lastName = lastName; 
		this.salary = salary;
		this.email = email;
		this.department = department;
	}
	
	public Employee() {
		
		
	}
	
	
	public String getFirstName() {
		
		return firstName; 
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName; 
	}
	
	public int getSalary() {
		
		return salary;
	}
	
	public void setSalary(int salary) {
		
		this.salary = salary;
	}
	
	public String getEmail() {
		return email; 
	}
	
	public void setEmail(String email) {
		this.email = email; 
	}
	
	public Department getDepartment() {
		
		return department;
	}
	
	public void setDepartment(Department department) {
		
		this.department = department; 
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", "
				+ "salary=" + salary + ", email=" + email
				+ ", department=" + department + "]";
	}
	
	
}
