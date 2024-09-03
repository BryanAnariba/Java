package com.hibernate.jpa.concepts;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.jpa.concepts.dtos.PersonDto;
import com.hibernate.jpa.concepts.entities.Person;
import com.hibernate.jpa.concepts.repositories.PersonRepository;

@SpringBootApplication
public class ConceptsApplication implements CommandLineRunner {

	Scanner inputKeyboardData = new Scanner(System.in);

	@Autowired()
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConceptsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.list();
		this.findOne("03f56459-9a22-447d-ac2b-a38ebf348d45");
		this.searchByFirstName("Name 5");
		this.personalizedQuery();
		this.personalizedQuery2();
		this.personalizedQuery3DISTINCT();

		
		
		// this.create();
		// this.update();
		// this.delete();
		// this.delete2();
		// this.personalizedQueries();
	}

	@Transactional(readOnly = true)
	public void list () {
		// List<Person> persons = (List<Person>) this.personRepository.findAll();
		// List<Person> persons = (List<Person>) this.personRepository.findByProgrammingLanguage("Node");
		List<Person> persons = (List<Person>) personRepository.findByProgrammingLanguageAndFirstName("Node", "First Name 4");
		persons
			.stream()
			.forEach(person -> {
				System.out.println(person);
			});

		List<Object[]> personsData = this.personRepository.findPersonData();
		personsData.stream()
			.forEach(person -> {
				System.out.println(person[0] + " is a developer expert in " + person[1]);
			});
	}

	@Transactional(readOnly = true)
	public void findOne (String id) {
		// Forma uno
		// Person person = null;
		// Optional<Person> optionalPerson = this.personRepository.findById(id);
		// if (optionalPerson.isPresent()) {
		// 	person = optionalPerson.get();
		// }
		// System.out.println(person);
		
		// Forma dos
		// this.personRepository.findById(id).ifPresent(person -> System.out.println(person));

		// Forma tres la mas resumida y optima
		this.personRepository.findOne(id).ifPresent(person -> System.out.println(person));
	}

	public void searchByFirstName(String firstName) {
		this.personRepository.findOneLikeFirstName(firstName).ifPresent(person -> System.out.println(person));
	}

	@Transactional()
	public void create () {
		System.out.println("Escriba su nombre: ");
		String firstName = inputKeyboardData.nextLine();
		System.out.println("Escriba su apellido: ");
		String lastName = inputKeyboardData.nextLine();
		System.out.println("Escriba su lenguaje favorito: ");
		String programmingLanguage = inputKeyboardData.nextLine();
		Person person = new Person(null, firstName, lastName, programmingLanguage);
		this.personRepository.save(person);
		this.personRepository.findById(person.getId()).ifPresent(p -> System.out.println(p));
		inputKeyboardData.close();
	}

	@Transactional()
	public void update () {
		Scanner inputKeyboardData = new Scanner(System.in);
		System.out.println("Escriba el id de la persona a modificar: ");
		String id = inputKeyboardData.nextLine();

		Optional<Person> person = this.personRepository.findById(id);
		if (person.isPresent()) {
			Person p = person.orElseThrow();
			System.out.println("Escriba el nuevo nombre: ");
			String firstName = inputKeyboardData.nextLine();
			System.out.println("Escriba el nuevo apellido: ");
			String lastName = inputKeyboardData.nextLine();
			System.out.println("Escriba el nuevo lenguaje favorito: ");
			String programmingLanguage = inputKeyboardData.nextLine();
			p.setFirstName(firstName);
			p.setLastName(lastName);
			p.setProgrammingLanguage(programmingLanguage);
			Person updated = this.personRepository.save(p);
			System.out.println("PERSON UPDATED!: " + updated);
		} else {
			System.out.println("USUARIO NO ENCONTRADO!");
		}
		inputKeyboardData.close();
	}

	@Transactional()
	public void delete () {
		Scanner inputKeyboardData = new Scanner(System.in);
		System.out.println("Escriba el id del usuario a eliminar: ");
		String id = inputKeyboardData.nextLine();

		this.personRepository.deleteById(id);
		System.out.println("DELETED SUCCESSFULLY!!!");
		inputKeyboardData.close();
	}

	@Transactional()
	public void delete2 () {
		Scanner inputKeyboardData = new Scanner(System.in);
		System.out.println("Escriba el id del usuario a eliminar: ");
		String id = inputKeyboardData.nextLine();

		Optional<Person> person = this.personRepository.findById(id);

		person.ifPresentOrElse(
			p -> {
				this.personRepository.delete(p);
				System.out.println("DELETED SUCCESSFULLY!!!");
			},  
			() -> {
				System.out.println("PERSON NOT FOUND!!!");
			});
		inputKeyboardData.close();
	}

	@Transactional(readOnly = true)
	public void personalizedQueries() {
		Scanner inputKeyboardData = new Scanner(System.in);
		System.out.println("Escriba el id del usuario a buscar: ");
		String id = inputKeyboardData.nextLine();

		String firstName = this.personRepository.getFirstNameById(id);
		System.out.println("First Name: " + firstName);

		String lastName = this.personRepository.getLastNameById(id);
		System.out.println("Last Name: " + lastName);

		String completeName = this.personRepository.getCompleteNameById(id);
		System.out.println("NOMBRE COMPLETO ENCONTRADO: " + completeName);
		inputKeyboardData.close();
	}

	@Transactional(readOnly = true)
	public void personalizedQuery() {
		System.out.println("Consulta por objeto persona y ademas lenguaje de programacion");
		List<Object[]> personResult = this.personRepository.getAllMixPersonData();
		personResult.forEach(p -> {
			System.out.println("Programming Language: " + p[1] + " - " + p[0]);
		});
	}

	@Transactional(readOnly = true)
	public void personalizedQuery2 () {
		List<Person> persons = this.personRepository.getPersonClassWith2Params();
		persons.forEach(p -> System.out.println(p));

		List<PersonDto> persons2 = this.personRepository.findAllPersonDto();
		persons2.forEach(p -> System.out.println(p));
	}

	// ULTIMAS QUERIES JPQL
	@Transactional(readOnly = true)
	public void personalizedQuery3DISTINCT () {
		List<String> persons = this.personRepository.findAllNames();
		persons.forEach(p -> System.out.println(p));

		List<String> personsDistinct = this.personRepository.findAllNameDistinct();
		personsDistinct.forEach(p -> System.out.println(p));

		Long totalCount = this.personRepository.findAllNameDistinctCount();
		System.out.println("Total Count: " + totalCount);
	}
}
