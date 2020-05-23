package com.SpringShopRest.controllers;


import com.SpringShopRest.entities.Countries;
import com.SpringShopRest.services.api.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountriesController {

    @Autowired
    private CountriesService countriesService;

    @GetMapping("/api/v1/countries")
    public ResponseEntity<Iterable<Countries>> articleGroups(@RequestParam("processed") Integer processed) {
        Iterable<Countries> groups = countriesService.findAll(processed);
        return new ResponseEntity<>(groups, HttpStatus.OK);
    }

    @PostMapping("/api/v1/countries/save")
    public ResponseEntity<Boolean> save(@RequestBody Countries articleGroups) {
        countriesService.save(articleGroups);
        return new ResponseEntity<>(true, HttpStatus.CREATED);
    }

    @DeleteMapping("api/v1/countries/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id){
        countriesService.delete(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
