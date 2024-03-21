package com.student.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.StudentDetails;
import com.student.repository.StudentRepository;
import com.student.request.StudentRequest;
import com.student.response.StudentResponse;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	@Autowired
	ModelMapper model;

	//insert data in database
	public String insertStudentDetails(StudentRequest request) {
		StudentDetails details=new StudentDetails();
		details.setId(request.getId());
		details.setName(request.getName());
		details.setMobile(request.getMobile());
		details.setAddress(request.getAddress());
		details.setEmail(request.getEmail());
		
		repository.save(details);
		return "Student Details Inserted Successfully...";
	}

	//view all details
	public List<StudentDetails> viewStudentDetails() {
		return repository.findAll();
		
	}
	
	//find details by id
	public StudentResponse getStudentDetailsById(String id) {
		Optional <StudentDetails> detail=repository.findById(id);
		if(!detail.isPresent()) throw new RuntimeException("Student Details Not Found.");
		StudentResponse response=model.map(detail.get(),StudentResponse.class);
		return response;
	}

	//update details
	public StudentDetails updateStudent(StudentDetails student) {
		StudentDetails data=repository.save(student);
		return data;
	}

	//delete 
	public void deleteStudentDetail(String id) {
		
		repository.deleteById(id);
		
	}


	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
