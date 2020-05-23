package com.SpringShopRest.services.api;


import com.SpringShopRest.entities.Countries;

public interface CountriesService {

    Iterable<Countries> findAll(Integer processed);

    Countries save(Countries country);

    void delete(Long id);
}
