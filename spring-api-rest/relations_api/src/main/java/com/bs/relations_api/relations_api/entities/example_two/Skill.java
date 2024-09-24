package com.bs.relations_api.relations_api.entities.example_two;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity()
@Table(name = "skills")
public class Skill {
  
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "skill_id")
  private UUID id;
  
  @Column(length = 150, nullable = false)
  private String name;
  
  @Enumerated(EnumType.STRING)
  private Level level;
  
  @ManyToOne()
  @JoinColumn(name = "person_id")
  @JsonBackReference()
  private Person person;

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

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Skill() {
  }

  public Skill(String name, Level level, Person person) {
    this.name = name;
    this.level = level;
    this.person = person;
  }
  
  
}
