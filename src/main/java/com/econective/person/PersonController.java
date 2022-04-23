package com.econective.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class PersonController {

	@Autowired
	PersonRepository personRepository;
	
	@GetMapping("/")
	public String GetAll() {
		return "Hello";
	}
	
	@GetMapping("/people")
	public List<PersonEntity> GetPeople() {
		return personRepository.findAll();
	}
	
}