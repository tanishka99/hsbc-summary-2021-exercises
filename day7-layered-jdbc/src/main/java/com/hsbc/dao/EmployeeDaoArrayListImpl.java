package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.beans.Employee;

public class EmployeeDaoArrayListImpl implements EmployeeDao {
	
	private static List<Employee> employees = new ArrayList<Employee>();

	public void save(Employee employee) {
		employees.add(employee);
	}

	public Employee fetchEmployeeById(int id) {
		Employee emp = null;
		for(Employee e : employees) {
			if(e.getId() == id) {
				emp = e;
				break;
			}
		}
		return emp;
	}

	public Employee[] findAllEmployees() {
		Employee[] employeeArray = employees.toArray(new Employee[employees.size()]);
		return employeeArray;
	}

	public void updateEmployee(int id, Employee employee) {
		Employee e = fetchEmployeeById(id);
		if(e.getId()==id)
		{
			e = employee;
		}
	}
}