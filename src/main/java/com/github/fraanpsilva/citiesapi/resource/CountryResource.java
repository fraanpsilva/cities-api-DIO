package com.github.fraanpsilva.citiesapi.resource;

import com.github.fraanpsilva.citiesapi.entity.CountryEntity;
import com.github.fraanpsilva.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public List<CountryEntity> countries(){
        return countryRepository.findAll();
    }
}
