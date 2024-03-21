package com.user.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.UserEntity;
import com.user.repository.UserRepository;
import com.user.request.UserRequest;
import com.user.response.UserResponse;


@Service 
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private ModelMapper mapper;

	public String registerUserData(UserRequest request) {
		UserEntity user=mapper.map(request, UserEntity.class);
//		UserEntity user=new UserEntity();
//		user.setId(request.getId());
//		user.setName(request.getName());
//		user.setAge(request.getAge());
//		user.setMobile(request.getMobile());
//		user.setEmail(request.getEmail());
//		user.setAddress(request.getAddress());
		repository.save(user);
		
		return "User Details Saved..";
	}

	public UserResponse getUserDetail(String email) {
		Optional<UserEntity> user=repository.findById(email);
		if(!user.isPresent()) throw new RuntimeException("User Not Found");
		
		UserResponse response =mapper.map(user.get(), UserResponse.class);
		return response;
	}




}
