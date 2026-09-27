package br.com.springProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.springProject.model.Person;
import br.com.springProject.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(
			value = "{id}",
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Person findById(@PathVariable("id") Long id) {
		return personService.findById(id);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Person>> findAll() {
		
		return ResponseEntity.ok().body(personService.findAll());
	}
	
	@PostMapping(
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Person> created(@RequestBody Person person) {
		Person obj = personService.salvar(person);
		return ResponseEntity.ok().body(obj);
	}
	
	@PutMapping(
		value = "{id}",
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Person> update(@PathVariable("id") Long id, @RequestBody Person person) {
		Person obj = personService.atualizar(person,id);
		return new ResponseEntity<Person>(obj, HttpStatus.CREATED);
	}
	
	@RequestMapping(
			value = "{id}",
				method = RequestMethod.DELETE,
				produces = MediaType.APPLICATION_JSON_VALUE
				)
		public ResponseEntity<Void> Delete(@PathVariable("id") Long id) {
			 personService.deletar(id);
			 return new ResponseEntity<>( HttpStatus.NO_CONTENT);
		}

}
