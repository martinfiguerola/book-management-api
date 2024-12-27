package dev.martin.book_management_api.controller;

import dev.martin.book_management_api.entity.Book;
import dev.martin.book_management_api.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/{id}")
    public ResponseEntity<Book> getOne ( @PathVariable Long id) {
        return bookService.findById(id)
                .map(bookExist -> new ResponseEntity<>(bookExist, HttpStatus.OK))
                .orElse(ResponseEntity.notFound().build());
    }

    // Build Update Book REST API
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook ( @PathVariable Long id,
                                             @RequestBody Book book) {
        return bookService.update(id, book)
                .map( bookExist -> new ResponseEntity<>(bookExist, HttpStatus.OK))
                .orElse(ResponseEntity.notFound().build());
    }

    // Build Delete Book REST API
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook (@PathVariable Long id) {
        if (bookService.delete(id)) {
            return new  ResponseEntity<>("Book removed successfully", HttpStatus.OK);
        }
        return ResponseEntity.notFound().build();

    }

}
