package com.hibernate.jpa.concepts.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.jpa.concepts.dtos.PersonDto;
import com.hibernate.jpa.concepts.entities.Person;

@Repository()
public interface PersonRepository extends CrudRepository <Person, String> {

  // Consulta normal como mongo
  List<Person> findByProgrammingLanguage(String programmingLanguage);

  // Consultas Personalizadas en la base es asi programming_language pero en la query de java se debe escribir como en el entity programmingLanguage
  @Query("SELECT p FROM Person p WHERE p.programmingLanguage = ?1 AND p.firstName = ?2")
  List<Person> findByProgrammingLanguageAndFirstName(String programmingLanguage, String firstName);

  @Query("SELECT p.firstName, p.programmingLanguage FROM Person p")
  List<Object[]> findPersonData();

  @Query("SELECT p.firstName, p.programmingLanguage FROM Person p WHERE p.programmingLanguage = ?1")
  List<Object[]> findPersonDataByProgrammingLanguage(String programmingLanguage);

  @Query("SELECT p FROM Person p WHERE p.id = ?1")
  Optional<Person> findOne(String id);

  // Esto supuestamente ya existe en hibernate
  @Query("SELECT p FROM Person p WHERE p.firstName Like %?1%")
  Optional<Person> findOneLikeFirstName(String firstName);

  // JPQL
  @Query("SELECT p.firstName FROM Person p WHERE p.id = ?1")
  String getFirstNameById(String id);

  @Query("SELECT p.lastName FROM Person p WHERE p.id = ?1")
  String getLastNameById(String id);

  @Query("SELECT CONCAT(p.firstName, ' ', p.lastName) FROM Person p WHERE p.id = ?1")
  String getCompleteNameById(String id);

  @Query("SELECT p, p.programmingLanguage FROM Person p")
  List<Object[]> getAllMixPersonData();

  @Query("SELECT new Person(p.firstName, p.lastName) FROM Person p")
  List<Person> getPersonClassWith2Params();

  @Query("SELECT new com.hibernate.jpa.concepts.dtos.PersonDto(p.firstName, p.lastName) FROM Person p")
  List<PersonDto> findAllPersonDto();

  // AQUI VIENEN LAS ULTIMAS CONSULTA JPQL BUENISIMAS POR CIERTO
  @Query("SELECT p.firstName FROM Person p")
  public List<String> findAllNames();

  @Query("SELECT distinct(p.firstName) FROM Person p")
  public List<String> findAllNameDistinct();

  @Query("SELECT count(distinct(p.firstName)) FROM Person p")
  public Long findAllNameDistinctCount();
}

