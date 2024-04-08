package com.bortmanco.librearyservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardIndexDto {
    private Long studentId;
    private boolean reserved;
    private Long id;
}
