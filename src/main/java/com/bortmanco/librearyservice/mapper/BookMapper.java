package com.bortmanco.librearyservice.mapper;

import com.bortmanco.librearyservice.data.ent.Book;
import com.bortmanco.librearyservice.dto.BookDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book dtoToBook(BookDto bookDto);

}
