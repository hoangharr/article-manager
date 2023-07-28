package com.example.btth.controller;

import com.example.btth.model.Article;
import com.example.btth.model.Genre;
import com.example.btth.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService service;

    @GetMapping("/articles/genre")
    public List<Article> findArticlesByGenreID() {
        return service.getArticlesByGenreID();
    }
    @GetMapping("/articles/author")
    public List<Article> findArticlesByAuthorName() {
        return service.getArticlesByAuthorName();
    }
}
