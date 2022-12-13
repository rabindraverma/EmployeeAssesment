package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	
	
	void addEmploye(Employee employee);

	List<Employee> findAllEmployees();

	void deleteByHisId(int id);
		
}
