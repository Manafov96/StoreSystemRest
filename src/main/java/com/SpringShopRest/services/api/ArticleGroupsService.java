package com.SpringShopRest.services.api;

import com.SpringShopRest.entities.ArticleGroups;

public interface ArticleGroupsService {

    Iterable<ArticleGroups> findAll(Integer processed);

    ArticleGroups save(ArticleGroups articleGroups);

    void delete(Long id);

}
