package com.bs.relations_api.relations_api.controllers;

import com.bs.relations_api.relations_api.entities.example_one.Book;
import com.bs.relations_api.relations_api.entities.example_one.Library;
import com.bs.relations_api.relations_api.repository.BookRepository;
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
@RequestMapping("/api/books")
public class BookController {
  
  @Autowired()
  private BookRepository bookRepository;
  
  @Autowired()
  private LibraryRepository libraryRepository;
  
  @GetMapping("")
  public ResponseEntity<Page<Book>> getItems (Pageable pageable) {
    return ResponseEntity.ok(this.bookRepository.findAll(pageable));
  }
  
  @GetMapping("/{book_id}")
  public ResponseEntity<Book> getItem (@PathVariable UUID book_id) {
    Optional<Book> existsBook = this.bookRepository.findById(book_id);
    if (!existsBook.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    return new ResponseEntity(existsBook.get(), HttpStatus.OK);
  }
  
  @PostMapping("")
  public ResponseEntity<Book> createItem(@Valid @RequestBody Book book) {
    Optional<Library> existsLibrary = this.libraryRepository.findById(book.getLibrary().getId());
    if (!existsLibrary.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    book.setLibrary(existsLibrary.get());
    Book saved = this.bookRepository.save(book);
    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{book_id}").buildAndExpand(saved.getId()).toUri();
    return ResponseEntity.created(location).body(saved);
  }
  
  @PutMapping("/{book_id}")
  public ResponseEntity<Book> editItem(@PathVariable UUID book_id, @Valid @RequestBody Book book) {
    
    Optional<Library> existsLibrary = this.libraryRepository.findById(book.getLibrary().getId());
    if (!existsLibrary.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    
    Optional<Book> existsBook = this.bookRepository.findById(book_id);
    if (!existsBook.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    
    book.setLibrary(existsLibrary.get());
    book.setId(existsBook.get().getId());
    
    Book saved = this.bookRepository.save(book);
    return new ResponseEntity(saved, HttpStatus.OK);
  }
  
  @DeleteMapping("{book_id}")
  public ResponseEntity<Book> deleteItem (@PathVariable UUID book_id) {
    Optional<Book> existsBook = this.bookRepository.findById(book_id);
    if (!existsBook.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    this.bookRepository.delete(existsBook.get());
    return ResponseEntity.ok().body(existsBook.get());
  }
  
}
