package com.butcheer.repositories;

import com.butcheer.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Butcheer on 2019-04-02 14:33
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
