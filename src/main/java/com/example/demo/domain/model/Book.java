package com.example.demo.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(name = "title")
    private String title;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    protected Book() {

    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}
