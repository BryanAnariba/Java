package com.bs.relations_api.relations_api.controllers;

import com.bs.relations_api.relations_api.entities.example_four.Instructor;
import com.bs.relations_api.relations_api.repository.InstructorRepository;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/instructors")
public class InstructorController {
  
  @Autowired()
  private InstructorRepository instructorRepository;
  
  @GetMapping("")
  public List<Instructor> getItems () {
    return this.instructorRepository.findAll();
  }
  
  @GetMapping("/{instructor_id}")
  public ResponseEntity<Instructor> getItem (@PathVariable UUID instructor_id) {
    Optional<Instructor> instructor = this.instructorRepository.findById(instructor_id);
    if (!instructor.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    return new ResponseEntity(instructor, HttpStatus.OK);
  }
  
  @PostMapping("")
  public Instructor createItem (@Valid @RequestBody Instructor instructor) {
    return this.instructorRepository.save(instructor);
  }
  
  @PutMapping("/{instructor_id}")
  public ResponseEntity<Instructor> editItem (@PathVariable UUID instructor_id, @Valid @RequestBody Instructor instructor) {
    Optional<Instructor> existsInstructor = this.instructorRepository.findById(instructor_id);
    if (!existsInstructor.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    existsInstructor.get().setEmail(instructor.getEmail());
    existsInstructor.get().setName(instructor.getName());
    existsInstructor.get().setLast_name(instructor.getLast_name());
    this.instructorRepository.save(existsInstructor.get());
    return new ResponseEntity(existsInstructor.get(), HttpStatus.OK);
  }
  
  @DeleteMapping("/{instructor_id}")
  public ResponseEntity<Instructor> deleteItem (@PathVariable UUID instructor_id) {
    Optional<Instructor> existsInstructor = this.instructorRepository.findById(instructor_id);
    if (!existsInstructor.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    this.instructorRepository.delete(existsInstructor.get());
    return new ResponseEntity(existsInstructor.get(), HttpStatus.OK);
  }
  
}
