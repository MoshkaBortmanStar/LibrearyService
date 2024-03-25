package com.bortmanco.librearyservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private String title;
    private String author;
    private Integer year;

}
