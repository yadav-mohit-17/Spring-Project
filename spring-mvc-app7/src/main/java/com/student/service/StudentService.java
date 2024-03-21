package com.student.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.StudentEntity;
import com.student.repository.StudentRepository;
import com.student.request.StudentRequest;
import com.student.response.StudentResponse;

@Service 
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	
	 @Autowired
	    private ModelMapper modelMapper;
	
	

	public String registerStudentDetails(StudentRequest request) {
		StudentEntity student=modelMapper.map(request, StudentEntity.class);
		repository.save(student);
		return "Student Registration Successfull";
	}
	
	public List<StudentEntity> fetchAllStudent(){
		return repository.findAll();
	}
	
	public Optional <StudentEntity> fetchStudentById(int id){
		return repository.findById(id);
	}
	
	public void deleteStudentById(int id) {
		repository.deleteById(id);
	}
	
	public void deleteAllStudent() {
		repository.deleteAll();
	}
	
	public StudentEntity updateStudentDetails(StudentEntity entity) {
		return repository.save(entity);
	}

}
