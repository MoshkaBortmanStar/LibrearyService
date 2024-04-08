package com.bortmanco.librearyservice.mapper;

import com.bortmanco.librearyservice.data.ent.Cardindex;
import com.bortmanco.librearyservice.dto.CardIndexDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardIndexMapper {
    public Cardindex mapToCardIndex(CardIndexDto cardIndexDto);
}
