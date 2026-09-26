package br.com.springProject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.springProject.model.Person;

@Service
public class PersonService {
	
	private AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<>();
		
		for(int i=0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}
	
	private Person mockPerson(int i) {
		logger.info("uma pessoa foi encontrada "+i);
		
		Person person  = new Person();
		person.setId(counter.incrementAndGet());
		person.setFistName("Person "+i);
		person.setLastName("last Name "+i);
		person.setAddrees("Brasil "+i);
		person.setGender("Masculino");
		return person;
	}

	public Person findById(String id) {
		logger.info("uma pessoa foi encontrada");
		
		Person person  = new Person();
		person.setId(counter.incrementAndGet());
		person.setFistName("Marcus Aurelio");
		person.setLastName("Melo de Oliveira Santos");
		person.setAddrees("Novo Gama GO");
		person.setGender("Masculino");
		
		
		
		return person;
	}
	
	public Person salvar(Person person) {
		logger.info("criando nova Pessoa");
		return person; 
	}
	
	public Person atualizar(Person person, Long id) {
		logger.info("Pessoa Atualizada");
		
		person.setId(id);
		
		return person;
	}
	
	public void deletar(Long id) {
		logger.info("Deletar Pessoa");
		
	}
}
