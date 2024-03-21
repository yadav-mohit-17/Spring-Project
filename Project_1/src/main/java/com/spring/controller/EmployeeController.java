package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Employee;
import com.spring.request.EmployeeRequest;
import com.spring.response.EmployeeResponse;
import com.spring.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	//CRUD OPERATION
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody EmployeeRequest request) {
		String msg=service.addEmployee(request);
		return msg;
	}
	
	@GetMapping("/total")
	public List<Employee> getAllEmployee(){
		List<Employee> employee=service.getAllEmployee();
		return employee;
	}
	@GetMapping("/get/{id}")
	public EmployeeResponse getEmployeeById(@PathVariable("id") String id) {
		return service.getEmployeeById(id);
	}

	@PutMapping("/update")
	public Employee updateDetails(@RequestBody Employee employee) {
		Employee emp=service.updateEmployee(employee);
		return emp;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployeeDetails(@PathVariable String id) {
		String msg=service.deleteEmployeeDetails(id);
		return msg +id;
	}
	// QUERY PARAMETER
	
	@GetMapping("/get/city")
	public EmployeeResponse getEmployeeByCity(@RequestParam String city) {
		return service.getEmployeeByCity(city);
	}
	
	
	
	
	
	
	
	
	
}
