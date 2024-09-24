package com.bs.relations_api.relations_api.repository;

import com.bs.relations_api.relations_api.entities.example_one.Library;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, UUID>{
  
}
