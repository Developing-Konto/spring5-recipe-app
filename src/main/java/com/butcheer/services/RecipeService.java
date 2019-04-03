package com.butcheer.services;

import com.butcheer.domain.Recipe;

import java.util.Set;

/**
 * Created by Butcheer on 2019-04-03 13:50
 */
public interface RecipeService {
    Set<Recipe> findAll();

}
