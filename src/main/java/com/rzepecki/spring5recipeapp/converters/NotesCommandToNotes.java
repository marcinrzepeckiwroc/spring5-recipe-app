package com.rzepecki.spring5recipeapp.converters;

import com.rzepecki.spring5recipeapp.commands.NotesCommands;
import com.rzepecki.spring5recipeapp.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NotesCommandToNotes implements Converter<NotesCommands, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommands notesCommands) {
        if(notesCommands==null){
            return null;
        }

        final Notes notes = new Notes();
        notes.setId(notesCommands.getId());
        notes.setRecipeNotes(notesCommands.getRecipeNotes());
        return notes;
    }
}
