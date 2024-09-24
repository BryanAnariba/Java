package com.bs.relations_api.relations_api.entities.example_three;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity()
@Table(name = "publications")
public class Publication extends AuditModel {
  
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
    
  @Column(length = 150, nullable = false)
  @NotNull()
  @Size(max = 150)
  private String title;
  
  @Column(length = 255)
  @NotNull()
  @Lob()
  private String description;

  @Column(length = 255)
  @NotNull()
  @Lob()
  private String content;
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
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
  
}
