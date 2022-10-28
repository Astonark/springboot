package com.example.demo.domain.service;

import com.example.demo.data.repository.BookRepository;
import com.example.demo.domain.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    private final BookRepository bookRepository;

    public LibraryServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
