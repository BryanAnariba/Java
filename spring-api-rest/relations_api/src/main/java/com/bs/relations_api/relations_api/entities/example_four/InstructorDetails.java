package com.bs.relations_api.relations_api.entities.example_four;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity()
@Table(name = "instructor_details")
public class InstructorDetails {
  
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @Column(name = "youtube_channel", length = 150)
  private String youtube_channel;
  
  @Column(length = 255)
  private String hobby;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getYoutube_channel() {
    return youtube_channel;
  }

  public void setYoutube_channel(String youtube_channel) {
    this.youtube_channel = youtube_channel;
  }

  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  public InstructorDetails() {
  }
   
}
