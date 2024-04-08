package com.bortmanco.librearyservice.sevice;

import org.example.universitystarter.dto.BookDto;

import java.util.List;

public interface CardIndexService {

    List<BookDto> getAvailableBooks();
}
