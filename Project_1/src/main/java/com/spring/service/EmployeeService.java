package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Employee;
import com.spring.repository.EmployeeRepository;
import com.spring.request.EmployeeRequest;
import com.spring.response.EmployeeResponse;

@Service 
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private ModelMapper model;

	//Adding Employee Details
	public String addEmployee(EmployeeRequest request) {
		Employee emp=new Employee();
		emp.setId(request.getId());
		emp.setName(request.getName());
		emp.setCity(request.getCity());
		emp.setEmail(request.getEmail());
		
		repository.save(emp);
		return "Record Successfully Inserted.....!";
	}

	//Getting all Employee Details
	public List<Employee> getAllEmployee() {
		
		return repository.findAll();
	}

	//Getting Employee Details By Id
	public EmployeeResponse getEmployeeById(String id) {
		 Optional <Employee> detail=repository.findById(id);
		 if(!detail.isPresent()) throw new RuntimeException("Employee Not Found ");
		 EmployeeResponse response=model.map(detail.get(), EmployeeResponse.class);
		 return response;
	}

	//Update Employee Details
	public Employee updateEmployee(Employee employee) {
		Employee emp=repository.save(employee);
		return emp;
	}

	//Delete Employee Details By Id
	public String deleteEmployeeDetails(String id) {
		repository.deleteById(id);
		return "Employee Details Deleted Successfull.....!";
	}

	public EmployeeResponse getEmployeeByCity(String city) {
		Optional<Employee> data=repository.findById(city);
		EmployeeResponse response=model.map(data.get(), EmployeeResponse.class);
		return response;
	}

	


		
	
}
