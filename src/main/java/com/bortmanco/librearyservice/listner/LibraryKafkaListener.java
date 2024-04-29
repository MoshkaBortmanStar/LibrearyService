package com.bortmanco.librearyservice.listner;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LibraryKafkaListener {



    @KafkaListener(id = "library_id", topics = "library")
    public void listen(Object studentDto) {
        log.info("Receive message from Kafka {}", studentDto);
    }


}
