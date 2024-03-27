package com.bortmanco.librearyservice.repository;

import com.bortmanco.librearyservice.data.ent.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {


}
