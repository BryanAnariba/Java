package com.bs.relations_api.relations_api.entities.example_three;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity()
@Table(name = "posts")
public class Post extends AuditModel {
  
  private static final long serialVersionID = 1L;
  
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @NotNull()
  @Lob()
  private String post;
  
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "publication_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private Publication publication;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }

  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }
    
}
