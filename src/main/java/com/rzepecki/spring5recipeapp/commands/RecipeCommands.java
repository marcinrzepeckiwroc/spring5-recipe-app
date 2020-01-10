package com.rzepecki.spring5recipeapp.commands;


import com.rzepecki.spring5recipeapp.domain.Difficulty;
import com.rzepecki.spring5recipeapp.domain.Ingredient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommands {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Difficulty difficulty;
    private NotesCommands notesCommands;
    private Set<CategoryCommand> categoryCommands = new HashSet<>();

}
