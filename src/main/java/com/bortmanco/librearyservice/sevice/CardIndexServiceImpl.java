package com.bortmanco.librearyservice.sevice;

import com.bortmanco.librearyservice.data.ent.Cardindex;
import com.bortmanco.librearyservice.mapper.BookMapper;
import com.bortmanco.librearyservice.repository.CardIndexRepository;
import lombok.RequiredArgsConstructor;
import org.example.universitystarter.dto.BookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardIndexServiceImpl implements CardIndexService {

    private final CardIndexRepository cardIndexRepository;
    private final BookMapper bookMapper;

    public List<BookDto> getAvailableBooks() {
//        List<Cardindex> allByReserved = cardIndexRepository.findAllByReserved(false);
//        return allByReserved.stream()
//                .map(cardindex -> bookMapper.bookToDto(cardindex.getBook()))
//                .toList();
        return bookMapper.bookListToDto(cardIndexRepository
                .findAllByReserved(false).stream().map(Cardindex::getBook).toList());
    }

}
