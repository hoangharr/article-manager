package com.example.btth.service;

import com.example.btth.model.Article;
import com.example.btth.model.Author;
import com.example.btth.model.Genre;
import com.example.btth.repository.ArticleRepo;
import com.example.btth.repository.AuthorRepo;
import com.example.btth.repository.GenreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ArticleRepo articleRepo;
    @Autowired
    private AuthorRepo authorRepo;
    @Autowired
    private GenreRepo genreRepo;

    public List<Article> getArticlesByGenreID() {
        int genreID = 2;
        return articleRepo.findByGenreGenreID(genreID);
    }
    public List<Article> getArticlesByAuthorName(){
        String authorName = "Nhacvietplus";
        return articleRepo.findByAuthorAuthorName(authorName);
    }
}
