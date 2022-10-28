package com.example.demo.domain.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birthdate")
    private LocalDate birthdate;

    public Author(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = null;
    }

    public Author(UUID id, String firstName, String lastName, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthDate;
    }

    protected Author() {

    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Optional<LocalDate> getBirthDate() {
        return Optional.ofNullable(birthdate);
    }
}
