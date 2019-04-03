package com.butcheer.services;

import com.butcheer.domain.Recipe;
import com.butcheer.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Butcheer on 2019-04-03 13:50
 */
@Service
public class RecipeServiceImpl implements RecipeService {
   private final RecipeRepository recipeRepository;

   public RecipeServiceImpl(
      RecipeRepository recipeRepository) {this.recipeRepository = recipeRepository;}


   @Override
   public Set<Recipe> findAll() {
      Set<Recipe> recipes = new HashSet<>();
      recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
      return recipes;
   }
}
