package com.bs.relations_api.relations_api.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity()
@Table(name = "libraries")
public class Library {

  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(length = 150, nullable = false)
  @NotNull()
  private String name;

  @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
  private Set<Book> books = new HashSet<>();

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Book> getBooks() {
    return books;
  }

  public void setBooks(Set<Book> books) {
    this.books = books;
    for (Book book: books) {
      book.setLibrary(this); // agregamos la biblioteca generada a cada libro
    }
  }

  public Library() {
  }

  public Library(UUID id) {
    this.id = id;
  }

}
