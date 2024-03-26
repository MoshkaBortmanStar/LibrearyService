package com.bortmanco.librearyservice.mappers;

import com.bortmanco.librearyservice.data.ent.Cardindex;
import com.bortmanco.librearyservice.dto.CardIndexDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CardIndexMapper {

    @Mapping(target = "studentId")
    Cardindex toCardIndex(CardIndexDto cardIndexDto);
}
