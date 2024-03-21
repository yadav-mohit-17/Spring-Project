package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentEntity;
import com.student.repository.StudentRepository;
import com.student.request.StudentRequest;
import com.student.service.StudentService;

@RestController 
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/register")
	public String createStudentData(@RequestBody StudentRequest request) {
		String msg=studentService.registerStudentDetails(request);
		return msg;
	}
	
	@GetMapping("/fetch")
	public List<StudentEntity> fetchAllStudent() {
		return studentRepository.findAll();
	}
	
	@GetMapping("/fetchById/{}")
	public Optional <StudentEntity> fetchStudentById(int id){
		return studentRepository.findById(id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteStudentById(@PathVariable int id) {
		studentService.deleteStudentById(id);
	}
	
	@DeleteMapping("/deleteAllstudent")
	public void deleteAllStudent() {
		studentService.deleteAllStudent();
		
	}
	
	@PutMapping("updateStudent/{id}")
	public StudentEntity updateStudentDetails(@RequestBody StudentEntity entity) {
		return studentService.updateStudentDetails(entity);
	}

}
