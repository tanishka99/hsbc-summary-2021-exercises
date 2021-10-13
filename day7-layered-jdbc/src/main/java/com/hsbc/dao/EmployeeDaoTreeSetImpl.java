package com.hsbc.dao;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.beans.Employee;

public class EmployeeDaoTreeSetImpl implements EmployeeDao {
	
	private static Set<Employee> employees = new TreeSet<Employee>();

	public void save(Employee employee) {
		employees.add(employee);
	}

	public Employee fetchEmployeeById(int id) {
		Employee e1 = null;
		for(Employee e : employees) {
			if(e.getId() == id) {
				e1 = e;
				break;
			}
		}
		return e1;
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