package com.employee.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void addEmploye(Employee employee) {
		LocalDate d2=LocalDate.now();
		String dob = employee.getDob();
		System.out.println(dob+"\n"+d2);
		String arr[]=dob.split("/");
		int d=Integer.parseInt(arr[0]);
		int m=Integer.parseInt(arr[1]);
		int y=Integer.parseInt(arr[2]);
		LocalDate d1 = LocalDate.of(d, m, y);
	    int years = Period.between(d1, d2).getYears();
		employee.setAge(years);
		repo.save(employee);

	}

	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> allEmployees = repo.findAll();
		return allEmployees;
	}

	@Override
	public void deleteByHisId(int id) {
		repo.deleteById(id);
	}
	

}
