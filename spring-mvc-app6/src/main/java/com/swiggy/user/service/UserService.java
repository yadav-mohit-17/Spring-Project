package com.swiggy.user.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.user.entity.SwiggyUsers;
import com.swiggy.user.entity.UserRecord;
import com.swiggy.user.repository.UserRecordRepository;
import com.swiggy.user.repository.UserRepository;
import com.swiggy.user.request.UserRegisterRequest;
import com.swiggy.user.response.UserRegisterResponse;
import com.swiggy.user.response.UserResponse;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	UserRecordRepository userRepository;
	
	  @Autowired
	    private ModelMapper modelMapper;

	public String registerUserDetails(UserRegisterRequest registerRequest) {
		// Mapping data to Entity Object
		
		/*
		 * SwiggyUsers user=new SwiggyUsers(); user.setName(registerRequest.getName());
		 * user.setEmail(registerRequest.getEmail());
		 * user.setMobile(registerRequest.getMobile());
		 * user.setPassword(registerRequest.getPassword());
		 */
		
		/*
		 * SwiggyUsers user = SwiggyUsers.builder().email(registerRequest.getEmail())
		 * .mobile(registerRequest.getMobile())
		 * .password(registerRequest.getPassword()).build();
		 */
		
		SwiggyUsers user = modelMapper.map(registerRequest,SwiggyUsers.class);
		repository.save(user);
		return "User Registered Successfully";
	}
	
	public String registerUserResponse(UserResponse userResponse) {
		UserRecord record=modelMapper.map(userResponse, UserRecord.class);
		userRepository.save(record);
		return "User Record Registered Successfully";
		
	}
	
	public UserRegisterResponse GetUserDetails(String email) {
		Optional<SwiggyUsers> user=repository.findById(email);
		
		if(!user.isPresent()) throw new RuntimeException("User Not found");
		
//		UserRegisterResponse response=new UserRegisterResponse();
//		response.setName(user.getName());
//		response.setEmail(user.getEmail());
//		response.setMobile(user.getMobile());
		
		UserRegisterResponse response = modelMapper.map(user.get(), UserRegisterResponse.class);
		return response;
	}
	
	public List<SwiggyUsers> getAllUserDetails(){
		return repository.findAll();
	}
	
	

}
