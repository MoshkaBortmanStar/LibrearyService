package com.bortmanco.librearyservice.mapper;

import com.bortmanco.librearyservice.data.ent.Book;
import org.example.universitystarter.dto.BookDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book dtoToBook(BookDto bookDto);

    BookDto bookToDto(Book book);

    List<BookDto> bookListToDto(List<Book> books);

}
