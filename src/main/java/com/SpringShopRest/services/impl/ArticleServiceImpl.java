package com.SpringShopRest.services.impl;

import com.SpringShopRest.entities.Articles;
import com.SpringShopRest.repositories.ArticleRepository;
import com.SpringShopRest.services.api.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Iterable<Articles> findAll(Integer processed) {
        return articleRepository.findAll(processed);
    }

    @Override
    public Articles save(Articles article) {
        return articleRepository.save(article);
    }

    @Override
    public void delete(Long id) {
        articleRepository.delete(id);
    }
}
