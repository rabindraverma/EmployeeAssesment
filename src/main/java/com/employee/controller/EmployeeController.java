package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@RequestMapping("/employee")
	public String getEmployeePage() {
		return "employee";
	}
	
	@RequestMapping("/addDetails")
	public String addEmployee(@ModelAttribute Employee employee,ModelMap modelMap) {
		empService.addEmploye(employee);
		modelMap.addAttribute("msg", "employeeAdded sucessfully");
		return "employee";
	}
	
	@GetMapping("/getAll")
	public String getAllEmployees(ModelMap modelMap) {
		List<Employee> allEmployees = empService.findAllEmployees();
		modelMap.addAttribute("allEmployees", allEmployees);
		return "allEmployee";
	}
	
	@GetMapping("/deleteEmployee")
	public String deleteEmployeeById(@RequestParam("id") int id,ModelMap modelMap) {
		empService.deleteByHisId(id);
		List<Employee> allEmployees = empService.findAllEmployees();
		modelMap.addAttribute("allEmployees", allEmployees);
		modelMap.addAttribute("msg","Employee deleted sucessfully...!" );
		return "allEmployee";
	}
	
	
}
