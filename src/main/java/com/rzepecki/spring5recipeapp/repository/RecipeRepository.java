package com.rzepecki.spring5recipeapp.repository;

import com.rzepecki.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
