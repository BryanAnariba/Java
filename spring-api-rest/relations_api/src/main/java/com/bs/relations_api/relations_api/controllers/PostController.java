package com.bs.relations_api.relations_api.controllers;

import com.bs.relations_api.relations_api.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/posts")
public class PostController {
  
  @Autowired()
  private PostRepository postRepository;
  
}
