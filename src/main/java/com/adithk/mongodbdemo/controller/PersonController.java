package com.adithk.mongodbdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.adithk.mongodbdemo.collections.PersonEntity;
import com.adithk.mongodbdemo.services.person.PersonService;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController{

	private final PersonService personService;

	PersonController(PersonService personService){
		this.personService=personService;
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer(@RequestBody PersonEntity person){
		return
			ResponseEntity.ok(
			personService
			.registerUser(person)
			.getPersonId()
			);
	}

	@GetMapping("")
	public List<PersonEntity> getPersonNameStartsWith(@RequestParam("name")String name){

		return personService.getPersonNameStartsWith(name);
	}

	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable String id){
		personService.deletePersonById(id);
	}

	@GetMapping("/age")
	public List<PersonEntity> getPersonAgeBetween(@RequestParam int minAge,@RequestParam int maxAge){

		return personService.getPersonAgeBetween(minAge,maxAge);
	}

 }