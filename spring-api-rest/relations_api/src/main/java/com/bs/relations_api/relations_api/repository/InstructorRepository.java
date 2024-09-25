package com.bs.relations_api.relations_api.repository;

import com.bs.relations_api.relations_api.entities.example_four.Instructor;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface InstructorRepository extends JpaRepository<Instructor, UUID>{
  
}
