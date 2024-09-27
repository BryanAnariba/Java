package com.bs.blog_auth.blog_auth.dtos;

import java.util.UUID;

public class PublicationDto {

  private UUID id;
  private String title;
  private String description;
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

  public PublicationDto() {
  }

}
