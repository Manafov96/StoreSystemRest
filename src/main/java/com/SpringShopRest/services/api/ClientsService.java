package com.SpringShopRest.services.api;

import com.SpringShopRest.entities.Clients;

public interface ClientsService {

    Iterable<Clients> findAll(Integer processed);

    Clients save(Clients client);

    void delete(Long id);
}
