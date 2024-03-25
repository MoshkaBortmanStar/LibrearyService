package com.bortmanco.librearyservice.repository;

import com.bortmanco.librearyservice.data.ent.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
