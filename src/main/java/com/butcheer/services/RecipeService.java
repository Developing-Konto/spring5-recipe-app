package com.butcheer.services;

import com.butcheer.domain.Recipe;

import java.util.Set;

/**
 * Created by Butcheer 04.04.2019.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
