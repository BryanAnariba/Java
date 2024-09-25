package com.bs.relations_api.relations_api.entities.example_four;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity()
@Table(name = "instructors")
public class Instructor {
  
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @Column(length = 100)
  private String name;
  
  @Column(length = 100, name = "last_name")
  private String last_name;
  
  @Column(length = 100, unique = true)
  private String email;
  
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "instructor_details_id")
  private InstructorDetails instructorDetails;

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

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }
  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InstructorDetails getInstructorDetails() {
    return instructorDetails;
  }

  public void setInstructorDetails(InstructorDetails instructorDetails) {
    this.instructorDetails = instructorDetails;
  }

  public Instructor() {
  }
    
}
