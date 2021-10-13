package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.exceptions.EmployeeAlreadyExistException;
import com.hsbc.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;
//	public EmployeeServiceImpl() {
//		// this is wrong approach we need to use factory pattern
//		dao = new EmployeeDaoArrayImpl();
//	}
	
	public EmployeeServiceImpl(EmployeeDao dao) {
		this.dao = dao;
	}

	public void store(Employee employee) throws EmployeeAlreadyExistException {
		Employee[] emp1=dao.findAllEmployees();
		for(Employee e:emp1)
		{
			if(e.getId()==employee.getId())
			{
				throw new EmployeeAlreadyExistException("This employee already exists!!");
			}
		
			}
		dao.save(employee);
		
	}

	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = dao.fetchEmployeeById(id);
		if(emp == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found");
		}
		return emp;
	}

	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	public void updateSalary(int id, double salary) throws EmployeeNotFoundException {
		Employee emp = findEmployee(id);
		emp.setSalary(salary);
		dao.updateEmployee(id, emp);
	}
		
	

	public void updateName(int id, String name) throws EmployeeNotFoundException {
		Employee employee = findEmployee(id);
		employee.setName(name);
		dao.updateEmployee(id, employee);
	}
			
	}

