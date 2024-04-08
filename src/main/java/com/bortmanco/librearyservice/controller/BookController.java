package com.bortmanco.librearyservice.controller;


import com.bortmanco.librearyservice.data.ent.Book;
import com.bortmanco.librearyservice.dto.BookDto;
import com.bortmanco.librearyservice.mapper.BookMapper;
import com.bortmanco.librearyservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/books")
@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookMapper bookMapper;
    private final BookRepository bookRepository;


    @PutMapping
    public Book insertBook(@RequestBody  BookDto bookDto) {
         return bookRepository.save(bookMapper.mapToBook(bookDto));
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }



}
