package com.krishantha.rentcloud.vehicleservice.repository;

import com.krishantha.rentcloud.commons.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
