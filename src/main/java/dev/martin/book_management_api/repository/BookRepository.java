package dev.martin.book_management_api.repository;

import dev.martin.book_management_api.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
