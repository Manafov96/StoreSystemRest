package com.SpringShopRest.repositories;

import com.SpringShopRest.entities.Countries;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CountriesRepository extends CrudRepository<Countries, Long> {

    @Query(nativeQuery = true, value = "select RAC.ID, RAC.NAME, RAC.SORTING from REST_COUNTRIES_GET(?)RAC")
    Iterable<Countries> findAll(Integer processed);
}
