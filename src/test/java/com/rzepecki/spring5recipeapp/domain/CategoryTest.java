package com.rzepecki.spring5recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();
    }

    @Test
    public void setId() {
        Long value =4L;
        category.setId(value);
        assertEquals(value, category.getId());
    }

    @Test
    public void setDescription() {
        String desc = "ballallda";
        category.setDescription(desc);
        assertEquals(desc, category.getDescription());
    }

    @Test
    public void setRecipes() {
    }
}