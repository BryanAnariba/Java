package com.bs.relations_api.relations_api.repository;

import com.bs.relations_api.relations_api.entities.Book;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, UUID>{
  
}
