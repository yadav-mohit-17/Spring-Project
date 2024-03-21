package com.zomato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.dto.UserLogin;
import com.zomato.dto.UserRegister;
import com.zomato.entity.UserEntity;
import com.zomato.repository.ZomatoUserRepository;

@Service
public class ZomatoUserService {
	
	@Autowired
	ZomatoUserRepository repository;


	public String registerUser(UserRegister request) {
		//convert to Entity Object
		UserEntity entity =new UserEntity();
		entity.setEmailId(request.getEmailId());
		entity.setPassword(request.getPassword());
		entity.setFullName(request.getFullName());
		entity.setContactNumber(request.getContactNumber());
		repository.save(entity);
		return "User Created Successfully..Please Login Now";
	}


	public String loginUser(UserLogin request) {
		UserEntity entity=repository.findByEmailIdAndPassword(request.getEmailId(),request.getPassword());
		
		System.out.println(entity);
		if(entity != null) {
			return "User Login is Success. Welcome To home page";
		}
		else {
			return "Invalid User Credendials .Please Try Again";
		}
	}

}
