package com.example.demo.api;

import com.example.demo.domain.model.Book;
import com.example.demo.domain.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final LibraryService libraryService;

    @Autowired
    public BookController(LibraryService libraryService) {
       this.libraryService = libraryService;
    }

    @GetMapping
    public List<Book> getAll() {
        return libraryService.getAllBooks();
    }
}
