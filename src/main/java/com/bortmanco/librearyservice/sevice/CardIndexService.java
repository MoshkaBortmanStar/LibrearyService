package com.bortmanco.librearyservice.sevice;

import com.bortmanco.librearyservice.dto.BookDto;

import java.util.List;

public interface CardIndexService {

    List<BookDto> getAvailableBooks();
}
