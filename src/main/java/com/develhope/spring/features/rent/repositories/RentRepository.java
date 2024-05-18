package com.develhope.spring.features.rent.repositories;

import com.develhope.spring.features.rent.RentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RentRepository extends JpaRepository<RentEntity, Long> {
}

