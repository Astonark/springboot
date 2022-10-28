package com.example.demo.data.repository;

import com.example.demo.domain.model.Author;

import java.util.List;

public interface AuthorRepository {
    List<Author> findAll();
}
