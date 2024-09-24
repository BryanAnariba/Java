package com.bs.relations_api.relations_api.entities.example_two;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity()
@Table(name = "persons")
public class Person {
  
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "person_id")
  private UUID id;
  
  @Column(length = 150, nullable = false)
  private String name;
  
  @Column(nullable = false)
  private int age;
  
  @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
  private Set<Skill> skills = new HashSet<>();
  
  @ManyToMany()
  @JsonBackReference()
  @JoinTable(
    name= "persons_per_parties", 
    joinColumns = @JoinColumn(name = "person_id", referencedColumnName = "person_id"),
    inverseJoinColumns = @JoinColumn(name = "party_id", referencedColumnName = "party_id")
  )
  private Set<Party> parties = new HashSet<>();

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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Set<Skill> getSkills() {
    return skills;
  }

  public void setSkills(Set<Skill> skills) {
    this.skills = skills;
  }

  public Set<Party> getParties() {
    return parties;
  }

  public void setParties(Set<Party> parties) {
    this.parties = parties;
  }

  public Person() {
  }

}
