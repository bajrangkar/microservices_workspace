package com.krishantha.rentcloud.vehicleservice.service;

import com.krishantha.rentcloud.commons.model.Customer;
import com.krishantha.rentcloud.commons.model.Vehicle;
import com.krishantha.rentcloud.vehicleservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle fetchById(int vehicleId) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(vehicleId);
        if (vehicle.isPresent()) {
            return vehicle.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Vehicle> fetchAllProfiles() {
        return vehicleRepository.findAll();
    }
}
