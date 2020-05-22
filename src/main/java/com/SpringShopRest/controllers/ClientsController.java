package com.SpringShopRest.controllers;

import com.SpringShopRest.entities.Clients;
import com.SpringShopRest.services.api.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientsController {

    @Autowired
    private ClientsService clientsService;

    @GetMapping("/api/v1/clients")
    public ResponseEntity<Iterable<Clients>> clients(@RequestParam("processed") Integer processed) {
        Iterable<Clients> clients = clientsService.findAll(processed);
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @PostMapping("/api/v1/clients/save")
    public ResponseEntity<Boolean> save(@RequestBody Clients clients) {
        clientsService.save(clients);
        return new ResponseEntity<>(true, HttpStatus.CREATED);
    }

    @DeleteMapping("api/v1/clients/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id){
        clientsService.delete(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
