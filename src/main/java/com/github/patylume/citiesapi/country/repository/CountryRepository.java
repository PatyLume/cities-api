package com.github.patylume.citiesapi.country.repository;

import com.github.patylume.citiesapi.country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
