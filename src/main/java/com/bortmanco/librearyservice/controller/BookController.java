package com.bortmanco.librearyservice.controller;


import com.bortmanco.librearyservice.data.ent.Book;
import com.bortmanco.librearyservice.mapper.BookMapper;
import com.bortmanco.librearyservice.repository.BookRepository;
import com.bortmanco.librearyservice.sevice.CardIndexService;
import lombok.RequiredArgsConstructor;
import org.example.universitystarter.dto.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/books")
@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;
    private final CardIndexService cardIndexService;
    private final BookMapper bookMapper;


    @PutMapping
    public Book insertBook(@RequestBody BookDto bookDto) {
        return bookRepository.save(bookMapper.dtoToBook(bookDto));
    }

    @GetMapping
    public List<BookDto> getAvailableBooks() {
        return cardIndexService.getAvailableBooks();
    }

}
