package com.butcheer.repositories;

import com.butcheer.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Butcheer on 2019-04-02 14:32
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
