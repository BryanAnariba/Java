package com.bs.relations_api.relations_api.controllers;

import com.bs.relations_api.relations_api.entities.example_two.Skill;
import com.bs.relations_api.relations_api.repository.SkillRepository;
import jakarta.validation.Valid;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/skills")
public class SkillsController {
  
  @Autowired()
  private SkillRepository skillRepository;
  
  @GetMapping("")
  public ResponseEntity<Collection<Skill>> getItems () {
    return new ResponseEntity(this.skillRepository.findAll(), HttpStatus.OK);
  }
  
  @GetMapping("/{skill_id}")
  public ResponseEntity<Skill> getItem (@PathVariable UUID skill_id) {
    Optional<Skill> existsSkill = this.skillRepository.findById(skill_id);
    if (!existsSkill.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    return new ResponseEntity(existsSkill, HttpStatus.OK);
  }
  
  @PostMapping("")
  public ResponseEntity<Skill> createItem (@Valid @RequestBody Skill skill) {
    return new ResponseEntity(this.skillRepository.save(skill), HttpStatus.CREATED);
  }
}
