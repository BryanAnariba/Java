package com.bs.relations_api.relations_api.entities.example_two;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity()
@Table(name = "parties")
public class Party {
 
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "party_id")
  private UUID id;
  
  @Column(length = 255, nullable = false)
  private String location;
  
  @Column(name = "date_party", nullable = false)
  @JsonFormat(pattern = "YYYY-MM-dd")
  private Date date_party;
  
  //@ManyToMany(cascade = CascadeType.ALL)
  @ManyToMany()
  @JoinTable(
    name= "persons_per_parties", 
    joinColumns = @JoinColumn(name = "party_id", referencedColumnName = "party_id"),
    inverseJoinColumns = @JoinColumn(name = "person_id", referencedColumnName = "person_id")
  )
  private Set<Person> persons = new HashSet<>();

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Date getDate_party() {
    return date_party;
  }

  public void setDate_party(Date date_party) {
    this.date_party = date_party;
  }

  public Set<Person> getPersons() {
    return persons;
  }

  public void setPersons(Set<Person> persons) {
    this.persons = persons;
  }

  public Party() {
  }
  
}
