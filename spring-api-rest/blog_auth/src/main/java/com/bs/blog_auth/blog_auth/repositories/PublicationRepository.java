package com.bs.blog_auth.blog_auth.repositories;

import com.bs.blog_auth.blog_auth.entities.Publication;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationRepository extends JpaRepository<Publication, UUID>{
  
}
