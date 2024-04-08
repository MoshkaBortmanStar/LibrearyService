package com.bortmanco.librearyservice.controller;

import com.bortmanco.librearyservice.data.ent.Cardindex;
import com.bortmanco.librearyservice.dto.CardIndexDto;
import com.bortmanco.librearyservice.mapper.CardIndexMapper;
import com.bortmanco.librearyservice.repository.CardIndexRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/card-index")
@RestController
@RequiredArgsConstructor
public class CardIndexController {

    private final CardIndexMapper cardIndexMapper;
    private final CardIndexRepository cardIndexRepository;


    @PutMapping
    public Cardindex insertCartIndex(@RequestBody CardIndexDto cardIndexDto) {
        return cardIndexRepository.save(cardIndexMapper.mapToCardIndex(cardIndexDto));
    }


}
