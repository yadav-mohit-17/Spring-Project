package com.google.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.response.CountryResponse;
import com.google.response.StudentResponse;
import com.google.service.GoogleService;

@RestController
public class GoogleController {

	@Autowired
	GoogleService googleService;

	// HERE WE USE REST SERVICES
	// call crud_application RestService
	// http://http://localhost:8087/crud_application/student/fetch/std101
	// Get

	@GetMapping("/fetch/{id}")
	public StudentResponse getStudentData(@PathVariable String id) {

		StudentResponse response = googleService.getStudentData(id);
		return response;
	}

	// https://countrieSnow.space/api/v0.2/countries/positions
	// Get

	/*
	 * { "error":false,"msg":"countries and positions retrieved",
	 * "data":[{"name":"Afghanistan","iso2":"AF","long":65,"lat":33},
	 * "name":"Albania","iso2":"AL","long":20,"lat":41],...}
	 * 
	 */
	
	@GetMapping("/city")
	public CountryResponse getCountryInfo() {

		String url = "https://countriesnow.space/api/v0.1/countries/positions";

		RestTemplate template = new RestTemplate();
		CountryResponse response = template.exchange(url, HttpMethod.GET, null, CountryResponse.class).getBody();
		return response;
	}

}
