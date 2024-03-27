package com.bortmanco.librearyservice.repository;

import com.bortmanco.librearyservice.data.ent.Cardindex;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardIndexRepository extends JpaRepository<Cardindex, Long> {

    List<Cardindex> findAllByReserved(boolean isReserved);
}
