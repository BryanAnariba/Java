package com.bs.relations_api.relations_api.repository;

import com.bs.relations_api.relations_api.entities.example_two.Skill;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface SkillRepository extends CrudRepository<Skill, UUID>{
  
}
