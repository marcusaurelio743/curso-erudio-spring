package br.com.springProject.service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.springProject.model.Person;

@Service
public class PersonService {
	
	private AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
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
}
