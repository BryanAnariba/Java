package com.bs.relations_api.relations_api.controllers;

import com.bs.relations_api.relations_api.entities.example_three.Post;
import com.bs.relations_api.relations_api.exceptions.ResourceNotFoundExceptions;
import com.bs.relations_api.relations_api.repository.PostRepository;
import com.bs.relations_api.relations_api.repository.PublicationRepository;
import jakarta.validation.Valid;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/posts")
public class PostController {
  
  @Autowired()
  private PostRepository postRepository;
  
  @Autowired()
  private PublicationRepository publicationRepository;
  
  @GetMapping("/publications/{publication_id}/get-posts")
  public Page<Post> getPostsByPublication (@PathVariable(value = "publication_id") UUID publication_id, Pageable pageable ) {
    return postRepository.findPublicationById(publication_id, pageable);
  }
  
  @PostMapping("/publications/{publication_id}/create-posts")
  public Post savePost (@PathVariable(value = "publication_id") UUID publication_id, @Valid @RequestBody Post post) {
    return this.publicationRepository
      .findById(publication_id)
      .map(publication -> {
        post.setPublication(publication);
        return this.postRepository.save(post);
      })
      .orElseThrow(() -> new ResourceNotFoundExceptions("Publication not found"));
  }
  
  @PutMapping("/publications/{publication_id}/posts/{post_id}")
  public Post updatePost (@PathVariable(value = "publication_id") UUID publication_id, @PathVariable(value = "post_id") UUID post_id, @Valid @RequestBody Post post) {
    if (!this.publicationRepository.existsById(publication_id)) {
      throw new ResourceNotFoundExceptions("Publication " + publication_id + " not found");
    }
    
    return this.postRepository
      .findById(post_id)
      .map(p -> {
        p.setPost(post.getPost());
        return this.postRepository.save(p);
      })
      .orElseThrow(() -> new ResourceNotFoundExceptions("Post " + post_id + " not found"));
  }
  
  @DeleteMapping("/publications/{publication_id}/posts/{post_id}")
  public ResponseEntity<?> deletePost (@PathVariable(value = "publication_id") UUID publication_id, @PathVariable(value = "post_id") UUID post_id) {
    return this.postRepository
      .findByIdAndPublicationId(post_id, publication_id)
      .map(post -> {
        this.postRepository.delete(post);
        return ResponseEntity.ok().build();
      })
      .orElseThrow(
        () -> new ResourceNotFoundExceptions("Post " + post_id + " and Publication " + publication_id + " not found")
      );
  }
  
}
