package dev.martin.book_management_api.service;

import dev.martin.book_management_api.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll ();
    Book save (Book book);
    Optional<Book> findById (Long id);
    Optional<Book> update (Long id, Book book);
    boolean delete (Long id);
}
