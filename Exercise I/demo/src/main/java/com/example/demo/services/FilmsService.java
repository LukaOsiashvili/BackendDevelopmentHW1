package com.example.demo.services;

import com.example.demo.dto.Paging;
import com.example.demo.dto.SearchFilms;
import com.example.demo.entities.Films;
import com.example.demo.repositories.FilmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FilmsService {

    private final FilmsRepository filmsRepository;

    @Autowired
    public FilmsService(FilmsRepository filmsRepository) {
        this.filmsRepository = filmsRepository;
    }

    public Page<Films> search(SearchFilms searchFilms, Paging paging){
        String title = searchFilms.getTitle() != null ? searchFilms.getTitle() : null;
        String description = searchFilms.getDescription() != null ? searchFilms.getDescription() : null;
        Integer releaseYear = searchFilms.getReleaseYear() != null ? searchFilms.getReleaseYear() : null;
        String languageName = searchFilms.getLanguageName() != null ? searchFilms.getLanguageName() : null;

        Pageable pageable = PageRequest.of(paging.getPage() - 1, paging.getSize());

        return filmsRepository.searchFilmsByTitleAndDescriptionAndRatingAndLanguage(title, description, releaseYear, languageName, pageable);

    }
}
