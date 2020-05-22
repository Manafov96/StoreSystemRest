package com.SpringShopRest.controllers;


import com.SpringShopRest.entities.ArticleGroups;
import com.SpringShopRest.services.api.ArticleGroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleGroupsController {

    @Autowired
    private ArticleGroupsService articleGroupsService;

    @GetMapping("/api/v1/articleGroups")
    public ResponseEntity<Iterable<ArticleGroups>> articleGroups(@RequestParam("processed") Integer processed) {
        Iterable<ArticleGroups> groups = articleGroupsService.findAll(processed);
        return new ResponseEntity<>(groups, HttpStatus.OK);
    }

    @PostMapping("/api/v1/articleGroups/save")
    public ResponseEntity<Boolean> save(@RequestBody ArticleGroups articleGroups) {
        articleGroupsService.save(articleGroups);
        return new ResponseEntity<>(true, HttpStatus.CREATED);
    }

    @DeleteMapping("api/v1/articleGroups/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id){
        articleGroupsService.delete(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
