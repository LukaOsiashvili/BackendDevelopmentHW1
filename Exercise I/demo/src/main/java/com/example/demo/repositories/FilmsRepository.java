package com.example.demo.repositories;

import com.example.demo.entities.Films;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FilmsRepository extends JpaRepository<Films, Long> {

    @Query(value = "SELECT new Films(f.title, f.description, f.rating) " +
            "JOIN f.language_id l" +
            "WHERE (:title is null or title LIKE %:title%) " +
            "AND (:description is null or description LIKE %:description%) " +
            "AND (:releaseYear is null or release_year = :releaseYear) " +
            "AND (:languageName is null or l.name = :languageName)", nativeQuery = true)
    Page<Films> searchFilmsByTitleAndDescriptionAndRatingAndLanguage(
            @Param("title") String title,
            @Param("description") String description,
            @Param("releaseYear") Integer releaseYear,
            @Param("langaugeName") String languageName, Pageable pageable);


}
