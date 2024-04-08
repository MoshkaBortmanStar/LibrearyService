package com.bortmanco.librearyservice.repository;

import com.bortmanco.librearyservice.data.ent.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}
