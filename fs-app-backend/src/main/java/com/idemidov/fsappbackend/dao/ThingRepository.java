package com.idemidov.fsappbackend.dao;

import com.idemidov.fsappbackend.models.Thing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThingRepository extends CrudRepository<Thing, Integer> {
}
