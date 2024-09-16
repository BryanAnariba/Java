package com.bs.relations_api.relations_api.controllers;

import com.bs.relations_api.relations_api.entities.Library;
import com.bs.relations_api.relations_api.repository.LibraryRepository;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController()
@RequestMapping("/api/libraries")
public class LibraryController {
  
  @Autowired()
  private LibraryRepository libraryRepository;
  
  @GetMapping("")
  public ResponseEntity<Page<Library>> getItems (Pageable pageable) {
    return ResponseEntity.ok(this.libraryRepository.findAll(pageable));
  }
  
  @GetMapping("/{library_id}")
  public ResponseEntity<Library> getItem (@PathVariable UUID library_id) {
    Optional<Library> existsLibrary = this.libraryRepository.findById(library_id);
    if (!existsLibrary.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(existsLibrary.get());
  }
  
  @PostMapping("")
  public ResponseEntity<Library> createItem (@Valid @RequestBody Library library) {
    Library saved = this.libraryRepository.save(library);
    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{library_id}").buildAndExpand(saved.getId()).toUri();
    return ResponseEntity.created(location).body(saved);
  }
  
  @PutMapping("/{library_id}")
  public ResponseEntity<Library> editItem (@PathVariable UUID library_id, @Valid @RequestBody Library library) {
    Optional<Library> existsLibrary = this.libraryRepository.findById(library_id);
    if (!existsLibrary.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    library.setId(existsLibrary.get().getId());
    this.libraryRepository.save(library);
    return new ResponseEntity<Library>(library, HttpStatus.OK);
  }
  
  @DeleteMapping("/{library_id}")
  public ResponseEntity<?> deleteItem(@PathVariable UUID library_id) {
    Optional<Library> existsLibrary = this.libraryRepository.findById(library_id);
    if (!existsLibrary.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    this.libraryRepository.delete(existsLibrary.get());
    return ResponseEntity.ok().build();
  }
  
}
