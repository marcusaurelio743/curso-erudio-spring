package br.com.springProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springProject.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
