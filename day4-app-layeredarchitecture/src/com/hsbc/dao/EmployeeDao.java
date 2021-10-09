package com.hsbc.dao;

import com.hsbc.beans.Employee;

public interface EmployeeDao {
	public void save(Employee employee);
	public Employee fetchEmployeeById(int id);
	public Employee[] findAllEmployees();
	public void updateSalary(int id, double salary);
	public void updateName(int id, String name);
	
}
