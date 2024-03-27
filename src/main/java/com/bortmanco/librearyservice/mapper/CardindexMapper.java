package com.bortmanco.librearyservice.mapper;

import com.bortmanco.librearyservice.data.ent.Cardindex;
import com.bortmanco.librearyservice.dto.CardindexDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardindexMapper {
    Cardindex dtoToCardindex(CardindexDto cardindexDto);

}
