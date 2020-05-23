package com.SpringShopRest.services.api;

import com.SpringShopRest.entities.Articles;

public interface ArticlesService {

    Iterable<Articles> findAll(Integer processed);

    Articles save(Articles article);

    void delete(Long id);

}
