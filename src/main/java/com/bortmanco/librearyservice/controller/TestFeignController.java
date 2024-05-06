package com.bortmanco.librearyservice.controller;


import com.bortmanco.librearyservice.feign.SecFeignClient;
import com.bortmanco.librearyservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestFeignController {

    private static final Logger log = LoggerFactory.getLogger(TestFeignController.class);
    private final BookRepository bookRepository;
    private final SecFeignClient secFeignClient;

    @GetMapping("/test")
    public ResponseEntity<?> test(@RequestHeader("token") String token) {
        if (secFeignClient.validateToken(token)) {
            log.info("TOKEN is A VALID");
            return ResponseEntity.ok(Arrays.asList(bookRepository.findAll()));
        }
        return ResponseEntity.internalServerError().body("TOKEN WROOOOONG!!!");
    }
}
