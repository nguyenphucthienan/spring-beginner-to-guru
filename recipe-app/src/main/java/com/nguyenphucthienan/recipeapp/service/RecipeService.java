package com.nguyenphucthienan.recipeapp.service;

import com.nguyenphucthienan.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}