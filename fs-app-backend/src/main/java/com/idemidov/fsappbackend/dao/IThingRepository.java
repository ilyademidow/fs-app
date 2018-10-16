package com.idemidov.fsappbackend.dao;

import com.idemidov.fsappbackend.models.dbdto.DThing;
import org.springframework.data.repository.CrudRepository;

public interface IThingRepository extends CrudRepository<DThing, Integer> {
}
