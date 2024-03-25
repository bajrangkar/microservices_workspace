package com.krishantha.rentcloud.vehicleservice.service;

import com.krishantha.rentcloud.commons.model.Vehicle;

import java.util.List;

public interface VehicleService {


    Vehicle save(Vehicle vehicle);

    Vehicle fetchById(int vehicleId);

    List<Vehicle> fetchAllProfiles();
}
