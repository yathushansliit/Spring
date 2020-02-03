package com.yathushan.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yathushan.training.salesmanager.model.Employee;
import com.yathushan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.yathushan.training.salesmanager.repository.EmployeeRepository;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
//	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		System.out.println("Default constructor executed");
		
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overloaded constructor executed");
		this.employeeRepository=employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}	

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter injection fired");
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
		
	}
	
	
	


}
