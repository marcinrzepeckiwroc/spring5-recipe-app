package com.rzepecki.spring5recipeapp.converters;

import com.rzepecki.spring5recipeapp.commands.NotesCommands;
import com.rzepecki.spring5recipeapp.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;


@Component
public class NotesToNotesCommand implements Converter<Notes, NotesCommands> {

    private final RecipeToRecipeCommand recipeConvert;

    public NotesToNotesCommand(RecipeToRecipeCommand recipeConvert) {
        this.recipeConvert = recipeConvert;
    }

    @Synchronized
    @Nullable
    @Override
    public NotesCommands convert(Notes source) {
        if(source==null){
            return null;
        }

        final NotesCommands notesCommands = new NotesCommands();
        notesCommands.setId(source.getId());
        notesCommands.setRecipeNotes(source.getRecipeNotes());
        //notesCommands.setRecipeCommands(recipeConvert.convert(source.getRecipe()));
        return notesCommands;
    }

}

