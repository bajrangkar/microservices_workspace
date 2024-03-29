package com.myfirst.microservices.vehicleservice.repository;

import com.myfirst.microservices.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 06:08
 * @Project rentcloudmodel
 */
public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
