package com.develhope.spring.features.rent.repositories.link;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LinkUserVehicleRepository extends JpaRepository<LinkRentUserVehicle,Long> {
    List<LinkRentUserVehicle> findUserEntitiesByRentEntity_Id(Long rentId);

   Optional<LinkRentUserVehicle> findByRent_Id(Long rentId);

}
