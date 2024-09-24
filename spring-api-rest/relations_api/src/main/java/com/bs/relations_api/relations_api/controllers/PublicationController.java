package com.bs.relations_api.relations_api.controllers;

import com.bs.relations_api.relations_api.repository.PublicationRepository;
import com.bs.relations_api.relations_api.entities.example_three.Publication;
import com.bs.relations_api.relations_api.exceptions.ResourceNotFoundExceptions;
import jakarta.validation.Valid;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController()
@RequestMapping("/api/publications")
public class PublicationController {
  
  @Autowired()
  private PublicationRepository publicationRepository;
  
  @GetMapping("")
  public Page<Publication> getItems (Pageable pageable) {
    return this.publicationRepository.findAll(pageable);
  }
  
  @PostMapping("")
  public ResponseEntity<Publication> createItem (@Valid @RequestBody Publication publication) {
    return new ResponseEntity(this.publicationRepository.save(publication), HttpStatus.CREATED);
  }
  
  @PutMapping("/{publication_id}")
  public Publication editItem (@PathVariable UUID publication_id, @Valid @RequestBody Publication publication) {
    return this
      .publicationRepository
      .findById(publication_id)
      .map(
        p -> {
          p.setTitle(publication.getTitle());
          p.setDescription(publication.getDescription());
          p.setContent(publication.getContent());
          return this.publicationRepository.save(p);
      })
      .orElseThrow(
        () -> new ResourceNotFoundExceptions("Publication with id " + publication.getId() + " not found")
      );
  }
  
  @DeleteMapping("/{publication_id}")
  public ResponseEntity<?> deleteItem (@PathVariable UUID publication_id) {
    return this.publicationRepository
      .findById(publication_id)
      .map(publication -> {
        this.publicationRepository.delete(publication);
        return ResponseEntity.ok().build();
      })
      .orElseThrow(
        () -> new ResourceNotFoundExceptions("Publication with id " + publication_id + " not found")
      );
  }
  
}
