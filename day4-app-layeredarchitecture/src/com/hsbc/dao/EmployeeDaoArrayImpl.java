package com.hsbc.dao;

import com.hsbc.beans.Employee;

public class EmployeeDaoArrayImpl implements EmployeeDao {
	private static Employee[] employeeDb = new Employee[10];
	private static int arrayIndexCounter = 0;
	@Override
	public void save(Employee employee) {
		employeeDb[arrayIndexCounter] = employee;
		arrayIndexCounter++;
	}
	@Override
	public Employee fetchEmployeeById(int id) {
		for(Employee emp:employeeDb)
		{
			if(emp.getId()==id)
				return(emp);
		}
		return null;
		
	}
	@Override
	public Employee[] findAllEmployees() {
		Employee[] tempDb = new Employee[arrayIndexCounter];
		for(int index = 0; index < arrayIndexCounter; index++) {
			tempDb[index] = employeeDb[index];
		}
		return tempDb;
	}
	
	@Override
	public void updateSalary(int id, double salary) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateName(int id, String name) {
		// TODO Auto-generated method stub
		for(int index=0;index<arrayIndexCounter;index++)
		{
			if(employeeDb[index].getId()==id)
			{
				employeeDb[index].setName(name);
			}
		}
		
	}

}
