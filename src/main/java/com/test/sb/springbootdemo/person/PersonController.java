package com.test.sb.springbootdemo.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@Autowired
	PersonServiceImpl service;

	@GetMapping("/persons")
	public ResponseEntity<List<Person>> getAllPersons() {
		return new ResponseEntity<List<Person>>(service.findAll() , HttpStatus.OK);
	}
	
	@GetMapping("/persons/{id}")
	public ResponseEntity<Person> getPerson(@PathVariable String id) {
		return new ResponseEntity<Person>(service.findById(id) , HttpStatus.OK);
	}
	
	@GetMapping("/persons/name/{name}")
	public ResponseEntity<Person> getPersonByName(@PathVariable String name) {
		return new ResponseEntity<Person>(service.findByName(name) , HttpStatus.OK);
	}
	
}
