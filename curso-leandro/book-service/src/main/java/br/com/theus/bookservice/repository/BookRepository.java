package br.com.theus.bookservice.repository;

import br.com.theus.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
