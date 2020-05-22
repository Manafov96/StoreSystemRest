package com.SpringShopRest.repositories;

import com.SpringShopRest.entities.ArticleGroups;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ArticleGroupsRepository extends CrudRepository<ArticleGroups, Long> {

    @Query(nativeQuery = true, value = "select RCG.ID, RCG.NAME_DE, RCG.NAME_BG, RCG.NAME_EN from REST_ARTICLES_GROUPS_GET(?) RCG")
    Iterable<ArticleGroups> findAll(Integer processed);
}
