package com.bs.relations_api.relations_api.repository;

import com.bs.relations_api.relations_api.entities.example_three.Post;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface PostRepository extends JpaRepository<Post, UUID>{
  Page<Post> findPublicationById(UUID publication_id, Pageable pageable);
  Optional<Post> findByAndPublicationId(UUID post_id, UUID publication_id);
}
