package com.SpringShopRest.controllers;

import com.SpringShopRest.entities.Articles;
import com.SpringShopRest.services.api.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticlesController {

    @Autowired
    private ArticlesService articleService;

    @GetMapping("/api/v1/articles")
    public ResponseEntity<Iterable<Articles>> articles(@RequestParam("processed") Integer processed) {
        Iterable<Articles> articles = articleService.findAll(processed);
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }

    @PostMapping("/api/v1/articles/save")
    public ResponseEntity<Boolean> save(@RequestBody Articles articles) {
        articleService.save(articles);
        return new ResponseEntity<>(true, HttpStatus.CREATED);
    }

    @DeleteMapping("api/v1/articles/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id){
        articleService.delete(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
