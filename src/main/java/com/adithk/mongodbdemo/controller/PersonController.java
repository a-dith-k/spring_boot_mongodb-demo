package com.adithk.mongodbdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adithk.mongodbdemo.collections.PersonEntity;
import com.adithk.mongodbdemo.services.person.PersonService;

@RestController
public class PersonController{

	private final PersonService personService;

	PersonController(PersonService personService){
		this.personService=personService;
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer(@RequestBody PersonEntity person){
		return 
			ResponseEntity
			.ok(
				personService
			.registerUser(person)
			.getPersonId()
			);
	}

}