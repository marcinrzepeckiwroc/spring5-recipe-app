package com.rzepecki.spring5recipeapp.converters;

import com.rzepecki.spring5recipeapp.commands.IngredientCommand;
import com.rzepecki.spring5recipeapp.domain.Ingredient;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {

    private final UnitOfMeasureToUnitOfMeasureCommand uomConvert;

    public IngredientToIngredientCommand(UnitOfMeasureToUnitOfMeasureCommand uomConvert) {
        this.uomConvert = uomConvert;
    }
    @Synchronized
    @Nullable
    @Override
    public IngredientCommand convert(Ingredient ingredient) {
        if(ingredient==null){
            return null;
        }

        final IngredientCommand ingredientCommand =new IngredientCommand();
        ingredientCommand.setId(ingredient.getId());
        ingredientCommand.setAmount(ingredient.getAmount());
        ingredientCommand.setDescription(ingredient.getDescription());
        ingredientCommand.setUnitOfMeasure(uomConvert.convert(ingredient.getUom()));
        return null;
    }
}
