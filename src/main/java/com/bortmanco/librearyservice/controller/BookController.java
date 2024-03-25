package com.bortmanco.librearyservice.controller;


import com.bortmanco.librearyservice.data.ent.Book;
import com.bortmanco.librearyservice.dto.BookDto;
import com.bortmanco.librearyservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/books")
@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;


    @PutMapping
    public Book insertBook(@RequestBody  BookDto bookDto) {
        Book book = new Book();
        book.setAuthor(bookDto.getAuthor());
        book.setTitle(bookDto.getTitle());
        book.setYear(bookDto.getYear());

         return bookRepository.save(book);
    }



}
