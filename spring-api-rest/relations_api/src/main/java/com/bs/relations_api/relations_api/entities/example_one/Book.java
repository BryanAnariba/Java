package com.bs.relations_api.relations_api.entities.example_one;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

@Entity()
@Table(
  name = "books", 
  uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})} 
)
public class Book {

  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(length = 150, nullable = false)
  @NotNull()
  private String name;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "library_id")
  @JsonProperty(access = Access.WRITE_ONLY)
  private Library library;

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

  public Library getLibrary() {
    return library;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  public Book() {
  }

  public Book(UUID id, String name, Library library) {
    this.id = id;
    this.name = name;
    this.library = library;
  }

  public Book(UUID id) {
    this.id = id;
  }
}
