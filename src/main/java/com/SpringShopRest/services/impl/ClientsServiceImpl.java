package com.SpringShopRest.services.impl;

import com.SpringShopRest.entities.Clients;
import com.SpringShopRest.repositories.ClientsRepository;
import com.SpringShopRest.services.api.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsServiceImpl implements ClientsService {

    @Autowired
    private ClientsRepository clientsRepository;

    @Override
    public Iterable<Clients> findAll(Integer processed) {
        return clientsRepository.findAll(processed);
    }

    @Override
    public Clients save(Clients client) {
        return clientsRepository.save(client);
    }

    @Override
    public void delete(Long id) {
       clientsRepository.delete(id);
    }
}
