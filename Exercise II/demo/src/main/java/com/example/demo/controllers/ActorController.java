package com.example.demo.controllers;

import com.example.demo.entities.Actor;
import com.example.demo.services.ActorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/actor")
public class ActorController {

    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @RequestMapping(value = "/actorsName", method = RequestMethod.GET, produces = {"applicatiom/json"})
    public List<Actor> getActorNames(){
        return actorService.getAllActorsFirstNameLastName();
    }
}
