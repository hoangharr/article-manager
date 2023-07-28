package com.example.btth.repository;

import com.example.btth.model.Article;
import com.example.btth.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Integer> {
    List<Article> findByGenreGenreID(int genreID);
    List<Article> findByAuthorAuthorName(String authorName);
}
