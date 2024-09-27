package com.bs.blog_auth.blog_auth.services;

import com.bs.blog_auth.blog_auth.dtos.PublicationDto;
import com.bs.blog_auth.blog_auth.dtos.PublicationResponseDto;
import java.util.UUID;

public interface PublicationService {
  
  public PublicationDto createPublication(PublicationDto publicationDto);
  public PublicationResponseDto getItems(int page, int limit, String orderBy);
  public PublicationDto getItem(UUID publication_id);
  public PublicationDto editItem (UUID publication_id, PublicationDto publicationDto);
  public void deleteItem (UUID publication_id);
  
}
