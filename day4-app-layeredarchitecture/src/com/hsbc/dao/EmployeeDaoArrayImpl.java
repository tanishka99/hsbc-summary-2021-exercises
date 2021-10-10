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
		for(int index=0;index<arrayIndexCounter;index++)
		{
			if(employeeDb[index].getId()==id)
			{
				employeeDb[index].setSalary(salary);
				System.out.println("Salary updated!");
			}
		}
//		boolean count=false;
//		for(int i=0;i<employeeDb.length;i++)
//		{
//		   if(employeeDb[i]!=null)
//		   {
//			   if(employeeDb[i].getId()==id)
//			   {
//				   count=true;
//				  employeeDb[i].setSalary(salary);
//				  System.out.println("Salary Updated");
//			   }
//		   }
//		}
		
	}
	@Override
	public void updateName(int id, String name) {
		// TODO Auto-generated method stub
		for(int index=0;index<arrayIndexCounter;index++)
		{
			if(employeeDb[index].getId()==id)
			{
				employeeDb[index].setName(name);
				System.out.println("Employee name updated");
			}
		}
		
	}

}
