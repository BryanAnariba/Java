package com.bs.blog_auth.blog_auth.services_impl;

import java.util.List;

import com.bs.blog_auth.blog_auth.dtos.PublicationDto;
import com.bs.blog_auth.blog_auth.dtos.PublicationResponseDto;
import com.bs.blog_auth.blog_auth.entities.Publication;
import com.bs.blog_auth.blog_auth.exceptions.ResourceNotFoundException;
import com.bs.blog_auth.blog_auth.repositories.PublicationRepository;
import com.bs.blog_auth.blog_auth.services.PublicationService;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service()
public class PublicationServiceImpl implements PublicationService {

  @Autowired()
  private PublicationRepository publicationRepository;
  
  @Override
  public PublicationDto createPublication(PublicationDto publicationDto) {
    Publication publication = this.transformDtoToEntity(publicationDto);
    Publication newPublication =  this.publicationRepository.save(publication);
    PublicationDto publicationResponse = this.transformPublicationToDto(newPublication);
    return publicationResponse;
  }

  @Override
  public PublicationResponseDto getItems(int page, int limit, String orderBy) {
    Pageable pageable = PageRequest.of(page, limit);
    Page<Publication> publications = this.publicationRepository.findAll(pageable);
    
    List<Publication> publicationsList = publications.getContent();
    List<PublicationDto> content = publicationsList.stream().map(publication -> this.transformPublicationToDto(publication)).collect(Collectors.toList());
    PublicationResponseDto publicationResponseDto = new PublicationResponseDto();
    
    publicationResponseDto.setData(content);
    publicationResponseDto.setPageNumber(publications.getNumber());
    publicationResponseDto.setPageAvg(publications.getSize());
    publicationResponseDto.setTotalElements((int) publications.getTotalElements());
    publicationResponseDto.setTotalPages(publications.getTotalPages());
    publicationResponseDto.setIsLast(publications.isLast());
    return publicationResponseDto;
  }
  
  @Override
  public PublicationDto getItem(UUID publication_id) {
    Publication publication = this.publicationRepository
      .findById(publication_id)
      .orElseThrow(
        () -> new ResourceNotFoundException("Publication", "id", publication_id)
      );
    
    return this.transformPublicationToDto(publication);
  }

  @Override
  public PublicationDto editItem(UUID publication_id, PublicationDto publicationDto) {
    Publication publication = this.publicationRepository.findById(publication_id).orElseThrow(
      () -> new ResourceNotFoundException("Publication", "id", publication_id)
    );
    publication.setTitle(publicationDto.getTitle());
    publication.setDescription(publicationDto.getDescription());
    publication.setContent(publicationDto.getContent());
    Publication publicationUpdated = this.publicationRepository.save(publication);
    return this.transformPublicationToDto(publicationUpdated);
  }
  
  @Override
  public void deleteItem(UUID publication_id) {
    Publication publication = this.publicationRepository.findById(publication_id).orElseThrow(
      () -> new ResourceNotFoundException("Publication", "id", publication_id)
    );
    this.publicationRepository.delete(publication);
  }
  
  private PublicationDto transformPublicationToDto (Publication publication) {
    PublicationDto publicationResponse = new PublicationDto();
    publicationResponse.setId(publication.getId());
    publicationResponse.setTitle(publication.getTitle());
    publicationResponse.setDescription(publication.getDescription());
    publicationResponse.setContent(publication.getContent());
    return publicationResponse;
  }
  
  private Publication transformDtoToEntity (PublicationDto publicationDto) {
    Publication publication = new Publication();
    publication.setTitle(publicationDto.getTitle());
    publication.setDescription(publicationDto.getDescription());
    publication.setContent(publicationDto.getContent());
    return publication;
  }
  
}
