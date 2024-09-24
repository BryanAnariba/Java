package com.bs.relations_api.relations_api.controllers;

import com.bs.relations_api.relations_api.entities.example_two.Party;
import com.bs.relations_api.relations_api.entities.example_two.Person;
import com.bs.relations_api.relations_api.repository.PersonRepository;
import jakarta.validation.Valid;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/persons")
public class PersonController {
  
  @Autowired
  private PersonRepository personRepository;
  
  @GetMapping("")
  public ResponseEntity<Collection<Person>> getItems () {
    return new ResponseEntity<>(this.personRepository.findAll(), HttpStatus.OK);
  }
  
  @GetMapping("/{person_id}")
  public ResponseEntity<Person> getItem (@PathVariable UUID person_id) {
    Optional<Person> existsPerson = this.personRepository.findById(person_id);
    if (!existsPerson.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    return new ResponseEntity(existsPerson.get(), HttpStatus.OK);
  }
  
  @GetMapping("/{person_id}/parties")
  public ResponseEntity<Party> getItemParties (@PathVariable UUID person_id) {
    Optional<Person> existsPerson = this.personRepository.findById(person_id);
    if (!existsPerson.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    return new ResponseEntity(existsPerson.get().getParties(), HttpStatus.OK);
  }
  
  @PostMapping("")
  public ResponseEntity<?> createItem (@Valid @RequestBody Person person) {
    return new ResponseEntity(this.personRepository.save(person), HttpStatus.CREATED);
  }
  
  @DeleteMapping("/{person_id}")
  public ResponseEntity<Person> deleteItem (@PathVariable UUID person_id) {
    Optional<Person> existsPerson = this.personRepository.findById(person_id);
    if (!existsPerson.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    this.personRepository.delete(existsPerson.get());
    return new ResponseEntity(existsPerson.get(), HttpStatus.OK);
  }
  
}
