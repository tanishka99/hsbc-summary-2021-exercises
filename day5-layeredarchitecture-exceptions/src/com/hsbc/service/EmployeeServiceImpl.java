package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;
import com.hsbc.exceptions.EmployeeAlreadyExistException;
import com.hsbc.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;
	public EmployeeServiceImpl() {
		// this is wrong approach we need to use factory pattern
		dao = new EmployeeDaoArrayImpl();
	}

	@Override
	public void store(Employee employee) throws EmployeeAlreadyExistException {
		Employee[] emp = dao.findAllEmployees();
		for(Employee e: emp) {
			if(e.getId() == employee.getId()) {
				throw new EmployeeAlreadyExistException("The Employee with "+e.getId()+" is already present");
			}
		}
		dao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = dao.fetchEmployeeById(id);
		if(emp == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found");
		}
		return emp;
	}

	@Override
	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void updateSalary(int id, double salary) throws EmployeeNotFoundException {
		Employee e= dao.fetchEmployeeById(id);
		if(e!=null)
		{
			e.setSalary(salary);
			dao.updateEmployee(id, e);
		}
		else {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found to update");
		}
		
		dao.updateEmployee(id, e);
			
	}

	@Override
	public void updateName(int id, String name) throws EmployeeNotFoundException {
		Employee e= dao.fetchEmployeeById(id);
		if(e!=null)
		{
			e.setName(name);
			dao.updateEmployee(id, e);
		}
		else {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found to update");
		}
		
		dao.updateEmployee(id, e);
			
		
			
	}

}