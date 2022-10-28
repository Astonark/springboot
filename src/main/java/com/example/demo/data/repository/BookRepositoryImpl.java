package com.example.demo.data.repository;

import com.example.demo.domain.model.Book;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class BookRepositoryImpl implements BookRepository{
    private final EntityManager em;

    @Autowired
    public BookRepositoryImpl(EntityManager em) {
        this.em = em;
    }
    @Override
    public List<Book> findAll() {
        var jpql = "SELECT b FROM Book b";

        return em
                .createQuery(jpql, Book.class)
                .getResultList();
    }

    public Optional<Book> find(UUID id) {
        var result = em.find(Book.class, id);
        return Optional.ofNullable(result);
    }
}