package com.example.demo.data.repository;

import com.example.demo.domain.model.Book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookRepository {
    List<Book> findAll();
    Optional<Book> find(UUID id);
}
