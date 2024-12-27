package dev.martin.book_management_api.controller;

import dev.martin.book_management_api.entity.Book;
import dev.martin.book_management_api.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController{

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Build Add Book REST API
    @PostMapping
    public ResponseEntity<Book> addBook ( @RequestBody Book book ) {
        Book bookDB = bookService.save(book);
        return new  ResponseEntity<>(bookDB, HttpStatus.CREATED);
    }

    // Build Get All Books REST API
    @GetMapping
    public ResponseEntity<List<Book>> getAll () {
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }
    // Build Get One Book REST API
    // Build Update Book REST API
    // Build Delete Book REST API
}
