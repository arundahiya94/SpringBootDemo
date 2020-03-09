package com.boot.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
