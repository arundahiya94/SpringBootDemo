package com.boot.location.repos;

import org.springframework.data.repository.CrudRepository;

import com.boot.location.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
