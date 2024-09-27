package com.bs.blog_auth.blog_auth.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.UUID;

@Entity()
@Table(
  name = "publications", 
  uniqueConstraints = {
    @UniqueConstraint(
      columnNames = {
        "title"
      }
    )
  }
)
public class Publication {
  
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @Column(length = 150, nullable = false)
  private String title;
  
  @Column(length = 250, nullable = false)
  private String description;
  
  @Column(length = 250, nullable = false)
  private String content;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Publication() {
  }

  public Publication(UUID id, String title, String description, String content) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.content = content;
  }
  
}
