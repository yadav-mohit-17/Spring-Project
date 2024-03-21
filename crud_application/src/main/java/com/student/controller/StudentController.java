package com.student.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentDetails;
import com.student.request.StudentRequest;
import com.student.response.StudentResponse;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public String addStudentDetails(@RequestBody StudentRequest request) {
	String msg=	service.insertStudentDetails(request);
	return msg;	
	}
	
	//view all student details at a time
	@GetMapping("/fetch")
	@ResponseStatus(HttpStatus.OK)
	public List<StudentDetails> getAllDetails(){
		List<StudentDetails> details=service.viewStudentDetails();
		return details;
	}

	//fetch any student by id
	@GetMapping("/fetch/{id}")
	@ResponseStatus(HttpStatus.OK)
	public StudentResponse getStudentById(@PathVariable String id) {
		return service.getStudentDetailsById(id);
	}	
	
	
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.RESET_CONTENT)
	public StudentDetails updateStudentDetail(@RequestBody StudentDetails student) {
		StudentDetails detail=service.updateStudent(student);
		return detail;
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteStudent(@PathVariable String id) {
		
		service.deleteStudentDetail(id);
	}
	
	//using Query String
	
	@GetMapping("/get/address")
	public String getStudentByAddress(@RequestParam("address") String address) {
		
		return "Students Are From "+address+"are 1000";
	}
	
	@GetMapping("/get/name/address")
	public String getStudentByNameAndAddress(@RequestParam(name="name")String name,
			@RequestParam(name="address", required=false) String address) {
		String response=null;
		if(name !=null) {
			response="With Name "+name+"5 student from "+address;
		}
		else if(address !=null) {
			response="from Address "+address+"40 Students";
		}
		else {
			response="over all india is 347827 Student";
		}
		return response;
	}
	
	
}
	
	

