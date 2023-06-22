package fh.aalen.person;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
	@Autowired
	PersonService personService;

	@GetMapping("/persons")
	public List<Person> getPersonList() {
		return personService.getPersonList();
	}

	@GetMapping("/persons/{id}")
	public Person getPerson(@PathVariable String id) {
		return personService.getPerson(id);
	}
	
	@PostMapping("/persons")
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}

	@PutMapping("/persons/{id}")
	public void updatePerson(@PathVariable String id, @RequestBody Person person) {
		personService.updatePerson(id, person);
	}

	@DeleteMapping("/persons/{id}")
	public void deletePerson(@PathVariable String id) {
		personService.deletePerson(id);
	}
	
	
}

