package com.bs.relations_api.relations_api.repository;

import com.bs.relations_api.relations_api.entities.example_three.Publication;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface PublicationRepository extends JpaRepository<Publication, UUID>{
  
}
