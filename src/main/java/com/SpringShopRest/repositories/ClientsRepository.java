package com.SpringShopRest.repositories;

import com.SpringShopRest.entities.Clients;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ClientsRepository extends CrudRepository<Clients, Long> {

    @Query(nativeQuery = true, value = "select RCG.ID, RCG.TYPE_ID, RCG.PERSON, " +
            "                           RCG.NAME, RCG.COUNTRY_ID, RCG.CITY, RCG.ADDRESS, RCG.VAT_NUMBER, " +
            "                           RCG.MOL from REST_CLIENTS_GET(?) RCG")
    Iterable<Clients> findAll(Integer processed);

}
