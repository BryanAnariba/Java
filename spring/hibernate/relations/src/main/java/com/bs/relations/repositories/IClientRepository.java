package com.bs.relations.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bs.relations.entities.Client;

public interface  IClientRepository extends  CrudRepository<Client, String>{

  @Query("SELECT c FROM Client c JOIN FETCH c.addresses")
  Optional<Client> findOneById(String id);
}
