package com.butcheer.repositories;

import com.butcheer.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Butcheer on 2019-04-02 14:33
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

   Optional<Category> findByDescription(String description);
}
