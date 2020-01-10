package com.rzepecki.spring5recipeapp.repository;

import com.rzepecki.spring5recipeapp.domain.Category;
import com.rzepecki.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
