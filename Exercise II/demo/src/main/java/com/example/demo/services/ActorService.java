package com.example.demo.services;

import com.example.demo.dto.ActorDTO;
import com.example.demo.entities.Actor;
import com.example.demo.repositories.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> getAllActorsFirstNameLastName(){
        return actorRepository.findAllActors();
    }
}
