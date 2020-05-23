package com.SpringShopRest.repositories;

import com.SpringShopRest.entities.Articles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ArticlesRepository extends CrudRepository<Articles, Long> {

    @Query(nativeQuery = true, value = "select RAG.ID, RAG.CODE, RAG.ARTICLE_GROUPS_ID, RAG.NAME_DE, " +
            "                           RAG.NAME_EN, RAG.NAME_BG, RAG.NOTES, RAG.MEASURE_ID, RAG.MIN_QUANTITY, RAG.PRICE from " +
            "                           REST_ARTICLES_GET(?)RAG")
    Iterable<Articles> findAll(Integer processed);
}
