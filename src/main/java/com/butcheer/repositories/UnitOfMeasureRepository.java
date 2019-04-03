package com.butcheer.repositories;

import com.butcheer.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Butcheer on 2019-04-02 14:34
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

   Optional<UnitOfMeasure> findByDescription(String description);
}
