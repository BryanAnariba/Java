package com.bs.blog_auth.blog_auth.controllers;

import com.bs.blog_auth.blog_auth.dtos.PublicationDto;
import com.bs.blog_auth.blog_auth.entities.Publication;
import com.bs.blog_auth.blog_auth.services.PublicationService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/publications")
public class PublicationController {
  
  @Autowired()
  private PublicationService publicationService;
  
  @PostMapping("")
  public ResponseEntity<PublicationDto> createItem (@RequestBody() PublicationDto publicationDto) {
    return new ResponseEntity(this.publicationService.createPublication(publicationDto), HttpStatus.CREATED);
  }
  
  @GetMapping("")
  public ResponseEntity<List<Publication>> getItems (
    @RequestParam(value = "pageNumber", defaultValue = "0", required = false) int page,
    @RequestParam(value = "pageSize", defaultValue = "10", required = false) int limit,
    @RequestParam(value = "sortBy", defaultValue = "id", required = false) String orderBy
  ) {
    return new ResponseEntity(this.publicationService.getItems(page, limit, orderBy), HttpStatus.CREATED);
  }
  
  @GetMapping("/{publication_id}")
  public ResponseEntity<PublicationDto> getItem (@PathVariable(value = "publication_id") UUID publication_id) {
    PublicationDto publicationResponse = this.publicationService.getItem(publication_id);
    return ResponseEntity.ok(publicationResponse);
  }
  
  @PutMapping("/{publication_id}")
  public ResponseEntity<PublicationDto> editItem (@PathVariable(value = "publication_id") UUID publication_id, @RequestBody PublicationDto publicationDto) {
    return ResponseEntity.ok(this.publicationService.editItem(publication_id, publicationDto));
  }
  
  @DeleteMapping("/{publication_id}")
  public ResponseEntity<String> deleteItem (@PathVariable(value = "publication_id") UUID publication_id) {
    this.publicationService.deleteItem(publication_id);
    return new ResponseEntity("The publication Was Deleted!", HttpStatus.OK);
  }
  
}
