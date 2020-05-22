package com.SpringShopRest.services.impl;

import com.SpringShopRest.entities.ArticleGroups;
import com.SpringShopRest.repositories.ArticleGroupsRepository;
import com.SpringShopRest.services.api.ArticleGroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticleGroupsServiceImpl implements ArticleGroupsService {

    @Autowired
    private ArticleGroupsRepository articleGroupsRepository;

    @Override
    @Transactional
    public Iterable<ArticleGroups> findAll(Integer processed) {
        return articleGroupsRepository.findAll(processed);
    }

    @Transactional
    @Override
    public ArticleGroups save(ArticleGroups articleGroups) {
        return articleGroupsRepository.save(articleGroups);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        articleGroupsRepository.delete(id);
    }
}
