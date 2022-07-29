package br.com.econective.Finance.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/person")
public class PersonController {

	@Autowired
	PersonRepository personRepository;
	
	@GetMapping("/")
	public List<PersonEntity> GetPeople() {
		return personRepository.findAll();
	}
	
	@GetMapping("/id/{id}")
	public PersonEntity GetById(@PathVariable(value="id") long id) {
		return personRepository.findById(id);
	}
	
	@GetMapping("/document1/{document1}")
	public PersonEntity GetByDocument1(@PathVariable(value="document1") String document1) {
		return personRepository.findByDocument1(document1);
	}
	
	@PostMapping("/")
	public PersonEntity Create(@RequestBody PersonEntity person) {
		return personRepository.save(person);
	}
	
	@PutMapping("/")
	public PersonEntity Update(@RequestBody PersonEntity person) {
		return personRepository.save(person);
	}
	
	@DeleteMapping("/")
	public void Delete(@RequestBody PersonEntity person) {
		personRepository.delete(person);
	}
}