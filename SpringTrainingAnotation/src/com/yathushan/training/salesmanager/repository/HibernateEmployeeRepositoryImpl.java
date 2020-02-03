package com.yathushan.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yathushan.training.salesmanager.model.Employee;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Yathushan");
		employee.setEmployeeLocation("Jaffna");
		employees.add(employee);
		
		return employees;
	} 
	

}
