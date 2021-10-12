package com.hsbc.dao;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistException;

public interface EmployeeDao  {
	public void save(Employee employee)throws EmployeeAlreadyExistException;
	public Employee fetchEmployeeById(int id);
	public Employee[] findAllEmployees();
	public void updateEmployee(int id, Employee employee);
	
	
	
}
