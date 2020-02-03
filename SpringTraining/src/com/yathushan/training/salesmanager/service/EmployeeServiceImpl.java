package com.yathushan.training.salesmanager.service;

import java.util.List;

import com.yathushan.training.salesmanager.model.Employee;
import com.yathushan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.yathushan.training.salesmanager.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
//	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		
		
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}	

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
		
	}
	
	
	


}
