package br.com.springProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(
			value = "{id}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Person findById(@PathVariable("id") String id) {
		return personService.findById(id);
	}
	
	@RequestMapping(
			
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<List<Person>> findAll() {
		
		return ResponseEntity.ok().body(personService.findAll());
	}
	
	@RequestMapping(
			
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Person created(@RequestBody Person person) {
		return personService.salvar(person);
	}
	
	@RequestMapping(
		value = "{id}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Person update(@PathVariable("id") Long id, @RequestBody Person person) {
		return personService.atualizar(person,id);
	}
	
	@RequestMapping(
			value = "{id}",
				method = RequestMethod.DELETE,
				produces = MediaType.APPLICATION_JSON_VALUE
				)
		public void Delete(@PathVariable("id") Long id) {
			 personService.deletar(id);
		}

}
