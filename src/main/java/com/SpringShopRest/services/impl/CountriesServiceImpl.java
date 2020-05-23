package com.SpringShopRest.services.impl;

import com.SpringShopRest.entities.Countries;
import com.SpringShopRest.repositories.CountriesRepository;
import com.SpringShopRest.services.api.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesServiceImpl implements CountriesService {

    @Autowired
    private CountriesRepository countriesRepository;

    @Override
    public Iterable<Countries> findAll(Integer processed) {
        return countriesRepository.findAll(processed);
    }

    @Override
    public Countries save(Countries country) {
        return countriesRepository.save(country);
    }

    @Override
    public void delete(Long id) {
        countriesRepository.delete(id);
    }
}
