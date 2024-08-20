package com.hibernate.jpa.concepts.entities;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "persons")
public class Person {

    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator()
    private String id;

    @Column(name = "first_name", length = 150, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 150, nullable = false)
    private String lastName;

    @Column(name = "programming_language", length = 150, nullable = false)
    private String programmingLanguage;

    @Embedded()
    private Audit audit;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String id, String firstName, String lastName, String programmingLanguage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.programmingLanguage = programmingLanguage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", programmingLanguage="
                + programmingLanguage + ", createdAt=" + this.audit.getCreatedAt() + ", updatedAt=" + this.audit.getUpdatedAt() + "]";
    }

}
