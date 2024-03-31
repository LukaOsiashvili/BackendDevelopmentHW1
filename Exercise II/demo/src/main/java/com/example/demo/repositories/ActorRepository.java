package com.example.demo.repositories;

import com.example.demo.dto.ActorDTO;
import com.example.demo.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    @Query("SELECT new com.example.dto.ActorDTO(a.firstName, a.lastName) FROM Actor a")
    List<Actor> findAllActors();

}
