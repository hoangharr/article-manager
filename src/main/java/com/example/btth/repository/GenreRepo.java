package com.example.btth.repository;

import com.example.btth.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepo extends JpaRepository<Genre, Integer> {
    @Query("SELECT g FROM Genre g LEFT JOIN Article a ON g.genreID = a.genre.genreID WHERE a.genre.genreID IS NULL")
    List<Genre> findGenresWithNoArticles();
    @Query("SELECT g FROM Genre g LEFT JOIN Article a ON g.genreID = a.genre.genreID GROUP BY g.genreID ORDER BY COUNT(a) DESC")
    List<Genre> findGenresOrderByArticleCount();
}
