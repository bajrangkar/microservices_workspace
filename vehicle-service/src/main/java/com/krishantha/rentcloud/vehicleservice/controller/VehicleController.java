package com.krishantha.rentcloud.vehicleservice.controller;

import com.krishantha.rentcloud.commons.model.Customer;
import com.krishantha.rentcloud.commons.model.Vehicle;
import com.krishantha.rentcloud.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class VehicleController {


    @Autowired
    VehicleService vehicleService;

    @RequestMapping(value = "/vehicle", method = RequestMethod.POST)
    public Vehicle save(@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @RequestMapping(value = "/vehicle", method = RequestMethod.GET)
    public Vehicle fetch(@RequestParam int vehicleId) {
        return vehicleService.fetchById(vehicleId);
    }

    @RequestMapping(value = "/vehicles", method = RequestMethod.GET)
    public List<Vehicle> fetch() {
        return vehicleService.fetchAllProfiles();
    }
}
