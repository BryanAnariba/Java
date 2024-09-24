package com.bs.relations_api.relations_api.controllers;

import com.bs.relations_api.relations_api.entities.example_two.Party;
import com.bs.relations_api.relations_api.repository.PartyRepository;
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
@RequestMapping("/api/parties")
public class PartyController {
  
  @Autowired
  private PartyRepository partyRepository;
  
  @GetMapping("")
  public ResponseEntity<Collection<Party>> getItems () {
    return new ResponseEntity(this.partyRepository.findAll(), HttpStatus.OK);
  }
  
  @GetMapping("/{party_id}")
  public ResponseEntity<Party> getItem (@PathVariable UUID party_id) { 
    Optional<Party> existsParty = this.partyRepository.findById(party_id);
    if (!existsParty.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    return new ResponseEntity(existsParty, HttpStatus.OK);
  }
  
  @PostMapping("")
  public ResponseEntity<Party> createItem (@Valid @RequestBody Party party) {
    return new ResponseEntity(this.partyRepository.save(party), HttpStatus.CREATED);
  }
  
  @DeleteMapping("/{party_id}")
  public ResponseEntity<Party> deleteItem (@PathVariable UUID party_id) {
    Optional<Party> existsParty = this.partyRepository.findById(party_id);
    if (!existsParty.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    this.partyRepository.delete(existsParty.get());
    return ResponseEntity.ok().build();
  }
  
}
