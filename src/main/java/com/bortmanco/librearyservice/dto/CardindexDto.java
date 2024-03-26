package com.bortmanco.librearyservice.dto;

import com.bortmanco.librearyservice.data.ent.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardindexDto {

    private Book book;
}