package com.butcheer.repositories;

import com.butcheer.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Butcheer 04.04.2019.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
