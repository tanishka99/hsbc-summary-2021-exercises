package com.hsbc;

import java.util.Scanner;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.exceptions.EmployeeAlreadyExistException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.factory.ObjectFactory;
import com.hsbc.service.EmployeeService;

public class ViewController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// this is wrong way of initializing which we will change by factory pattern.
		//EmployeeService service = new EmployeeServiceImpl();
		System.out.println("Enter which implementation you want use");
		System.out.println("1: Array 2: ArrayList 3: TreeSet 4: Database");
		int option = scan.nextInt();
		EmployeeDao empDao = ObjectFactory.getDaoInstance(option);
		EmployeeService service = ObjectFactory.getServiceInstance(empDao);
		int controllerOption = 0;
		do {
			System.out.println("Enter options:-");
			System.out.println("1: Store employee 2: Find employee by id 3: Find All employees 4: Update Name 5: Update Salary 0: Exit");
			controllerOption = scan.nextInt();
			switch(controllerOption) {
			case 1: 
				System.out.println("--- Enter employee details ------");
				Employee emp = new Employee();
				System.out.println("Enter id");
				emp.setId(scan.nextInt()); // instead of int id = scan.nextInt(); emp.setId(id);
				System.out.println("Enter name");
				emp.setName(scan.next());
				System.out.println("Enter salary");
				emp.setSalary(scan.nextDouble());
				try {
					service.store(emp);
					System.out.println("Stored successfully!");
				} catch (EmployeeAlreadyExistException e2) {
					// TODO Auto-generated catch block
					System.err.println(e2.getMessage());
				}
				System.out.println("Successfully stored.....");
				System.out.println("---------------------------------");
				break;
			case 2: 
				System.out.println("-------Enter id to search --------------");
				int id = scan.nextInt();
				try {
					Employee employee = service.findEmployee(id);
					System.out.println("Employee is found.....");
					System.out.println("Hello "+employee.getName()+", your salary is : "+employee.getSalary());
				} catch (EmployeeNotFoundException e1) {
					System.err.println(e1.getMessage());
				}
				break;
			case 3: 
				Employee[] employees = service.findAllEmployees();
				for(Employee e : employees) {
					System.out.println("Hello "+e.getName()+", Your salary is: "+e.getSalary()+" and id is : "+e.getId());
				}
				break;
			case 4: 
				break;
			case 5: 
				break;
			}
		} while(controllerOption != 0);
		scan.close();
	}
	
}