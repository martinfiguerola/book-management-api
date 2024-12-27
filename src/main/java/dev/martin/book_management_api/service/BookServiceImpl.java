package dev.martin.book_management_api.service;

import dev.martin.book_management_api.entity.Book;
import dev.martin.book_management_api.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
    @Override
    public Book save (Book book) {
        return bookRepository.save(book);
    }
    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }
    @Override
    public Optional<Book> update(Long id, Book book) {
        return bookRepository.findById(id).map(bookDB -> {
            bookDB.setAuthor(book.getAuthor());
            bookDB.setTitle(book.getTitle());
            bookDB.setPublicationYear(book.getPublicationYear());
            bookDB.setPrice(book.getPrice());
            return bookRepository.save(bookDB);
        });
    }
    @Override
    public boolean delete(Long id) {
        return bookRepository.findById(id)
                .map(book -> {
                    bookRepository.delete(book);
                    return true;
                }).orElse(false);
    }
}
