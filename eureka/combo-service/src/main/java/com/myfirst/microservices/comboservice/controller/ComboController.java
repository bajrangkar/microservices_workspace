package com.myfirst.microservices.comboservice.controller;

import com.myfirst.microservices.comboservice.service.ComboService;
import com.myfirst.microservices.comboservice.service.RentRestConsumer;
import com.myfirst.microservices.rent.DetailResponse;
import com.myfirst.microservices.rent.Rent;
import com.myfirst.microservices.rent.Response;
import com.myfirst.microservices.rent.SimpleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services/combo")
public class ComboController {
    @Autowired
    ComboService comboService;

    @Autowired
    RentRestConsumer rentRestConsumer;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return comboService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Response getRent(@PathVariable int id, @RequestParam(required = false) String type) {
        if(type==null){
            return new SimpleResponse(comboService.findById(id));
        }else{
            return comboService.findComboResponse(id);
        }
    }

    @GetMapping
    public List<Rent> getAllRents() {
        return rentRestConsumer.getAllRents();
    }
}
