package com.example.btth.repository;

import com.example.btth.model.Article;
import com.example.btth.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Integer> {
    List<Article> findByGenreGenreID(int genreID);
    List<Article> findByAuthorAuthorName(String authorName);
    @Query("SELECT a.articleID, a.title, a.songName, au.authorName, g.genreName, a.date FROM Article a JOIN a.genre g JOIN a.author au")
    List<Object[]> findAllArticlesWithDetails();
}
