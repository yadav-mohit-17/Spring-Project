package com.google.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.response.CountryResponse;
import com.google.response.StudentResponse;

@Service 
public class GoogleService {
	

	public StudentResponse getStudentData(String id) {
		String URL="http://localhost:8087/crud_application/fetch/"+id;
		
		//We Use a Class RestTemplate to integrate with RestServices
		RestTemplate template=new RestTemplate();
		
		ResponseEntity<StudentResponse> response=template.exchange(URL, HttpMethod.GET, null, StudentResponse.class);
		return response.getBody();
		
	}
	
	
	public CountryResponse getCountryInfo() {

		String url="https://countriesnow.space/api/v0.1/countries/positions";
		
		RestTemplate template=new RestTemplate();
		ResponseEntity<CountryResponse> response=template.exchange(url, HttpMethod.GET,null,CountryResponse.class);
		return response.getBody();
	}
	
	
}

