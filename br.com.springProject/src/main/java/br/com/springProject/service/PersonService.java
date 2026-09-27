package br.com.springProject.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springProject.exception.UnSuportOperationException;
import br.com.springProject.model.Person;
import br.com.springProject.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public List<Person> findAll(){
		return personRepository.findAll();
	}
	

	public Person findById(Long id) {
		logger.info("uma pessoa foi encontrada");
		
		Person person  = personRepository.findById(id).orElseThrow(()-> new UnSuportOperationException("objeto não encontrado") );
		return person;
	}
	
	public Person salvar(Person person) {
		logger.info("criando nova Pessoa");
		
		return personRepository.save(person); 
	}
	
	public Person atualizar(Person person, Long id) {
		logger.info("Pessoa Atualizada");
		
		Person obj = findById(id);
		
		obj.setLastName(person.getLastName());
		obj.setFistName(person.getFistName());
		obj.setAddrees(person.getAddrees());
		obj.setGender(person.getGender());
		
		return personRepository.save(obj);
	}
	
	public void deletar(Long id) {
		logger.info("Deletar Pessoa");
		
		personRepository.deleteById(id);
	}
}
