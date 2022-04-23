package br.com.econective.Finance.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}