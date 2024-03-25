package com.myfirst.microservices.comboservice.service;

import com.myfirst.microservices.rent.DetailResponse;
import com.myfirst.microservices.rent.Rent;
import com.myfirst.microservices.rent.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="rent")
public interface RentRestConsumer {

    @GetMapping("/services/rents")
    public List<Rent> getAllRents();

    @GetMapping(value = "/services/rents/{id}")
    public DetailResponse getRent(@PathVariable int id, @RequestParam(required = false) String type);
}
