package br.com.econective.Finance.Person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
	
	@GetMapping("/name/{name}")
	public List<PersonEntity> GetByName(@PathVariable(value="name") String name) {
		try {
			if(name.isEmpty() || name == "")
				throw new Exception("Warning: The field name is requerid!");
			else {
				List<PersonEntity> People = new ArrayList<PersonEntity>();
				People = personRepository.findByName(name);
				
				if(People.size() > 0) {
					return People;
				}
				else {
					return new ArrayList<PersonEntity>();
				}
			}
		}
		catch(RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ocurred error, " + ex.getMessage());
		}
		catch(Exception ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Ocurred error, " + ex.getMessage());
		}
	}
	
	@GetMapping("/document1/{document1}")
	public PersonEntity GetByDocument1(@PathVariable(value="document1") String document1) {
		return personRepository.findByDocument1(document1);
	}
	
	@PostMapping("/")
	public void Create(@RequestBody PersonEntity person) {
		personRepository.save(person);
	}
	
	@PutMapping("/")
	public void Update(@RequestBody PersonEntity person) {
		personRepository.save(person);
	}
	
	@DeleteMapping("/")
	public void Delete(@RequestBody PersonEntity person) {
		personRepository.delete(person);
	}
}