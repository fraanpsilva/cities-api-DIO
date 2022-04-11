package com.github.fraanpsilva.citiesapi.repository;

import com.github.fraanpsilva.citiesapi.entity.CountryEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

}
