package com.example.demo.controllers;

import com.example.demo.dto.RequestData;
import com.example.demo.dto.SearchFilms;
import com.example.demo.entities.Films;
import com.example.demo.services.FilmsService;
import com.example.demo.util.GeneralUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/api/films")
public class FilmsController {

    private final FilmsService filmsService;


    @Autowired
    public FilmsController(FilmsService filmsService) {
        this.filmsService = filmsService;
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST, produces = {"application/json"})
    public Page<Films> search(@RequestBody RequestData<SearchFilms> rd) throws Exception{
        GeneralUtil.checkRequiredProperties(rd.getData(), Arrays.asList("title", "description", "releaseYear", "language"));
        return filmsService.search(rd.getData(), rd.getPaging());
    }
}
