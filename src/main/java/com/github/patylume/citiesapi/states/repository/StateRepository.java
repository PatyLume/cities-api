package com.github.patylume.citiesapi.states.repository;

import com.github.patylume.citiesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
